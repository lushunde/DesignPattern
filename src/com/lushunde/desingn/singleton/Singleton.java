package com.lushunde.desingn.singleton;

import java.io.Serializable;

/**
 * 通用模式-饿汉式
 * 
 * @author bellus
 *
 */
public class Singleton implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3273287152119518024L;
	private static final Singleton singleton = new Singleton();

	// 限制产生多个对象
	private Singleton() {
	}

	// 通过该方法获得实例对象
	public static Singleton getSingleton() {
		return singleton;
	}

	// 类中其他方法，尽量是static
	public static void doSomething() {
	}
}
