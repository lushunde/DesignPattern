package com.lushunde.desingn.singleton;

import java.io.Serializable;

/**
 * ͨ��ģʽ-����ʽ
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

	// ���Ʋ����������
	private Singleton() {
	}

	// ͨ���÷������ʵ������
	public static Singleton getSingleton() {
		return singleton;
	}

	// ��������������������static
	public static void doSomething() {
	}
}
