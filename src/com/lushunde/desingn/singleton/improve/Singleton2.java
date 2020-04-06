package com.lushunde.desingn.singleton.improve;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * ͨ��ģʽ-����ʽ,����̰߳�ȫ������©���������л�
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

	// ���Ʋ����������
	private Singleton2()  {
		//������䴴������ֱ�����쳣
		if(singleton!=null){
			throw new RuntimeException("��ֹ���䴴������");
		}
	}

	// ͨ���÷������ʵ������+ ��������̰߳�ȫ����
	public static synchronized Singleton2  getSingleton() {
		if(singleton==null){
			singleton = new Singleton2();
		}
		return singleton;
	}

	// ��������������������static
	public static void doSomething() {
	}
	
	
	//��������л�©��
	public Object readResolve() throws ObjectStreamException{
		return singleton;
	}

	
	
}
