package com.lushunde.desingn.singleton.improve;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * ͨ��ģʽ-����ʽ,���ע������
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

	// ���Ʋ����������
	private Singleton()  {
		//������䴴������ֱ�����쳣
		if(singleton!=null){
			throw new RuntimeException("��ֹ���䴴������");
		}
	}

	// ͨ���÷������ʵ������
	public static Singleton getSingleton() {
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
