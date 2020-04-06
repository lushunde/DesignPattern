package com.lushunde.desingn.singleton.improve;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 通用模式-懒汉式,解决线程安全、反射漏洞、反序列化
 * 
 * @author bellus
 *
 */
public class Singleton2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7640246007296163797L;
	
	private static Singleton2 singleton = null;

	// 限制产生多个对象
	private Singleton2()  {
		//解决反射创建对象，直接抛异常
		if(singleton!=null){
			throw new RuntimeException("防止反射创建对象");
		}
	}

	// 通过该方法获得实例对象+ 加锁解决线程安全问题
	public static synchronized Singleton2  getSingleton() {
		if(singleton==null){
			singleton = new Singleton2();
		}
		return singleton;
	}

	// 类中其他方法，尽量是static
	public static void doSomething() {
	}
	
	
	//解决反序列化漏洞
	public Object readResolve() throws ObjectStreamException{
		return singleton;
	}

	
	
}
