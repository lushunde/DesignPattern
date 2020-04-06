package com.lushunde.desingn.singleton.improve;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 通用模式-饿汉式,解决注意事项
 * 
 * @author bellus
 *
 */
public class Singleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7640246007296163797L;
	
	private static final Singleton singleton = new Singleton();

	// 限制产生多个对象
	private Singleton()  {
		//解决反射创建对象，直接抛异常
		if(singleton!=null){
			throw new RuntimeException("防止反射创建对象");
		}
	}

	// 通过该方法获得实例对象
	public static Singleton getSingleton() {
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
