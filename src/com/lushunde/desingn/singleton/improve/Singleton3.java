package com.lushunde.desingn.singleton.improve;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 双重加锁,解决线程安全、效率、反射漏洞、反序列化
 * 
 * INSTANCE  = new SingleTon(); 
 * 这个步骤，其实在jvm里面的执行分为三步：
 *      1.在堆内存开辟内存空间。
 *      2.在堆内存中实例化SingleTon里面的各个参数。
 *      3.把对象指向堆内存空间。
 * 由于jvm存在乱序执行功能，所以可能在2还没执行时就先执行了3，如果此时再被切换到线程B上，由于执行了3，INSTANCE 已经非空了，会被直接拿出来用，这样的话，就会出现异常。这个就是著名的DCL失效问题。
 * 不过在JDK1.5之后，官方也发现了这个问题，故而具体化了volatile，即在JDK1.6及以后，只要定义为private volatile static SingleTon  INSTANCE = null;就可解决DCL失效问题。volatile确保INSTANCE每次均在主内存中读取，这样虽然会牺牲一点效率，但也无伤大雅。
 * @author bellus
 *
 */
public class Singleton3 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7640246007296163797L;

	//volatile 解决DCL失效
	private static volatile Singleton3 singleton = null;

	// 限制产生多个对象
	private Singleton3() {
		// 解决反射创建对象，直接抛异常
		if (singleton != null) {
			throw new RuntimeException("防止反射创建对象");
		}
	}

	// 通过该方法获得实例对象+ 加锁解决线程安全问题,双重判断 提高效率
	public static  Singleton3 getSingleton() {
		if (singleton == null) {
			synchronized (Singleton3.class) {
				if (singleton == null) {
					singleton = new Singleton3();
				}
			}
		}
		return singleton;
	}

	// 类中其他方法，尽量是static
	public static void doSomething() {
	}

	// 解决反序列化漏洞
	public Object readResolve() throws ObjectStreamException {
		return singleton;
	}

}
