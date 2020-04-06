package com.lushunde.desingn.singleton.improve;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 静态内部类 
 * 外部类加载时并不需要立即加载内部类，内部类不被加载则不去初始化INSTANCE，故而不占内存
 * 
 * @author bellus
 *
 */
public class Singleton4 implements Serializable {

	private static final long serialVersionUID = -7640246007296163797L;

	private Singleton4() {
		// 解决反射创建对象，直接抛异常
		if (SingletonHoler.INSTANCE != null) {
			throw new RuntimeException("防止反射创建对象");
		}
	}

	private static class SingletonHoler {
		private static Singleton4 INSTANCE = new Singleton4();
	}

	public static Singleton4 getSingleton() {
		return SingletonHoler.INSTANCE;
	}

	// 类中其他方法，尽量是static
	public static void doSomething() {
	}

	// 解决反序列化漏洞
	public Object readResolve() throws ObjectStreamException {
		return SingletonHoler.INSTANCE;
	}

}
