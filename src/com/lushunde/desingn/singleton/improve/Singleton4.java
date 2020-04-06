package com.lushunde.desingn.singleton.improve;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * ��̬�ڲ��� 
 * �ⲿ�����ʱ������Ҫ���������ڲ��࣬�ڲ��಻��������ȥ��ʼ��INSTANCE���ʶ���ռ�ڴ�
 * 
 * @author bellus
 *
 */
public class Singleton4 implements Serializable {

	private static final long serialVersionUID = -7640246007296163797L;

	private Singleton4() {
		// ������䴴������ֱ�����쳣
		if (SingletonHoler.INSTANCE != null) {
			throw new RuntimeException("��ֹ���䴴������");
		}
	}

	private static class SingletonHoler {
		private static Singleton4 INSTANCE = new Singleton4();
	}

	public static Singleton4 getSingleton() {
		return SingletonHoler.INSTANCE;
	}

	// ��������������������static
	public static void doSomething() {
	}

	// ��������л�©��
	public Object readResolve() throws ObjectStreamException {
		return SingletonHoler.INSTANCE;
	}

}
