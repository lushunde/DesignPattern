package com.lushunde.desingn.singleton.improve;

import java.io.Serializable;

/**
 * 枚举 
 * 默认就  线程安全、无反射漏洞，无序列化漏洞
 * @author bellus
 *
 */
public enum Singleton5 implements Serializable {

	INSTANCE;

	// 类中其他方法，尽量是static
	public static void doSomething() {
	}

}
