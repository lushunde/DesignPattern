package com.lushunde.desingn.singleton.improve;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * ��չ�������޵Ķ���ģʽ **���壺**
 * �����̶����������ģʽ�ͽ��������޵Ķ���ģʽ�����ǵ���ģʽ��һ����չ�����������޵Ķ���ģʽ�����ǿ��������ʱ�������ڴ����ж��ٸ�ʵ��������ϵͳ������չ��
 * �����������ܴ��ڵ��������⣬�ṩϵͳ����Ӧ�ٶȡ� **���ó���**�� ��ȡ�ļ������ö���̶���߲��������̶��������ܺ���Ӧ�ٶȡ�
 * 
 * @author bellus
 *
 */
public class MultitonSingleton implements Serializable {

	private static final long serialVersionUID = -7640246007296163797L;

	// ��������ܲ�����ʵ��������
	private static int maxNumOfMultiton = 2;

	// ����һ���б���������ʵ��
	private static ArrayList<MultitonSingleton> SingletonList = new ArrayList<MultitonSingleton>();
	// ��ǰʵ�������к�
	private static int countNumOfMultiton = 0;

	// �������ж���
	static {
		for (int i = 0; i < maxNumOfMultiton; i++) {
			SingletonList.add(new MultitonSingleton());
		}
	}

	private MultitonSingleton() {
		// ������䴴������ֱ�����쳣
		if (SingletonList.size() > maxNumOfMultiton) {
			throw new RuntimeException("�������Ѵﵽ���������ֹ���䴴������");
		}
	}

	// ������һ���ʵ۶���
	public static MultitonSingleton getInstance() {
		Random random = new Random();
		countNumOfMultiton = random.nextInt(maxNumOfMultiton);
		return SingletonList.get(countNumOfMultiton);
	}

	// ��������������������static
	public static void doSomething() {

	}

	// ��������л�©��
	public Object readResolve() throws ObjectStreamException {
		return SingletonList.get(countNumOfMultiton);
	}

}
