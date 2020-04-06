package com.lushunde.desingn.singleton.improve;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * ���� ��������
 * ����©��
 * �����л�©��
 * @author bellus
 *
 */

public class Client {

	public static void main(String[] args) {

		
		
		Singleton singleton = Singleton.getSingleton();

		// ��������
		test1(singleton);
		// ʵ�ַ��䴴���¶���
		testReflect(singleton);
		// ͨ�������л�
		testSerzi(singleton);

	}

	private static void test1(Singleton singleton) {
		// �������Σ��鿴�Ƿ�ͬһ������
		Singleton singleton2 = Singleton.getSingleton();
		System.out.print("��������: ");
		if (singleton == singleton2) {
			System.out.println("ͬһ������");
		} else {
			System.out.println("��ͬ����");
		}
	}

	private static void testReflect(Singleton singleton) {
		try {

			// ʵ�ַ��䴴���¶���
			Class<?> classType = Singleton.class;
			Class<?>[] cArg = new Class[0]; // ������ͣ��ղΣ�
			// ��ȡ ���췽�� ��
			Constructor<?> constructor = classType.getDeclaredConstructor(cArg);
			// �� ˽�з�������
			constructor.setAccessible(true);
			// �����¶���
			Singleton singleton3 = (Singleton) constructor.newInstance();

			System.out.print("���䴴��: ");
			if (singleton == singleton3) {
				System.out.println("ͬһ������");
			} else {
				System.out.println("��ͬ����");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void testSerzi(Singleton singleton) {
		// ͨ�������л�

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./singleton.txt"));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./singleton.txt"))) {

			oos.writeObject(singleton);
			oos.close();
			Singleton singleton4 = (Singleton) ois.readObject();

			ois.close();
			System.out.print("�����л�����: ");
			if (singleton == singleton4) {
				System.out.println("ͬһ������");
			} else {
				System.out.println("��ͬ����");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
