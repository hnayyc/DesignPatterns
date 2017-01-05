package com.imooc.proxy.jdkImpl;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import org.apache.commons.io.FileUtils;


public class Proxy {

	public static Object newProxyInstance(Class infce, InvocationHandler h) {
		
		String rt = "\r\n";
		String methodStr = "";
		for(Method m : infce.getMethods()) {
			methodStr += 
					"	@Override" + "\r\t" +
					"	public void " + m.getName() + "() {" + "\r\t" +
					"	try{" +
					"		Method md = " + infce.getName() + ".class.getClass().getMethod(\""  
											+ m.getName() + "\");" + "\r\t" +
					"		h.invoke(this, md);" + "\r\t" +
					"	}catch(Exception e){e.printStackTrace();}" + 
					"	}";
		}
		
		String str = 
				"package com.imooc.proxy.jdk2;" + "\r\t" +
				"import com.imooc.proxy.jdkImpl.InvocationHandler;" + "\r\t" +
				"import java.lang.reflect.Method;" + "\r\t" +
				"public class $Proxy0 implements " + infce.getName() + " {" + "\r\t" +
				"	private InvocationHandler h;" + "\r\t" +
				"	public $Proxy0(InvocationHandler h) {" + "\r\t" +
				"		this.h = h;" + "\r\t" +
				"	}" + "\r\t" +
					methodStr + "\r\t" +
				"}";
		
		String filename = System.getProperty("user.dir") + "/bin/com/imooc/proxy/jdkImpl/$Proxy0.java";
		System.out.println(filename);
		File file = new File(filename);
		try {
			FileUtils.writeStringToFile(file, str);
			
			/* 编译 */
			// 拿到编译器
			JavaCompiler complier = ToolProvider.getSystemJavaCompiler();
			// 文件管理者
			StandardJavaFileManager fileMgr = complier.getStandardFileManager(null, null, null);
			// 获取文件
			Iterable units = fileMgr.getJavaFileObjects(filename);
			// 便宜任务
			CompilationTask t = complier.getTask(null, fileMgr, null, null, null, units);
			// 进行编译
			t.call();
			fileMgr.close();
			
			/* load到内存 */
			ClassLoader cl = ClassLoader.getSystemClassLoader();
			Class c = cl.loadClass("com.imooc.proxy.jdkImpl.$Proxy0"); //TODO 此处有BUG，ClassNotFound
			System.out.println(c.getName());
			
			/* 创建动态代理类 */
			Constructor ctr = c.getConstructor(InvocationHandler.class);
			return ctr.newInstance(h);
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
}
