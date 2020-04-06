package com.lushunde.desingn.singleton.improve;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * �����޵Ķ���ģʽ ���� �������� ����©�� �����л�©��
 * 
 * @author bellus
 *
 */

public class MultitonClient6 {

	public static void main(String[] args) {

		MultitonSingleton instance = MultitonSingleton.getInstance();

		// ��ε��ã��鿴�ж��ٶ���
		test1();
		// ʵ�ַ��䴴���¶���
		testReflect(instance);
		// ͨ�������л�
		testSerzi(instance);

	}

	private static void test1() {
		// ����10�Σ��鿴����
		MultitonSingleton instance = null;
		for (int i = 0; i < 10; i++) {
			instance = MultitonSingleton.getInstance();
			System.out.println(instance);
		}

	}

	private static void testReflect(MultitonSingleton instance) {
		try {

			// ʵ�ַ��䴴���¶���
			Class<?> classType = Singleton5.class;
			Class<?>[] cArg = new Class[0]; // ������ͣ��ղΣ�
			// ��ȡ ���췽�� ��
			Constructor<?> constructor = classType.getDeclaredConstructor(cArg);
			// �� ˽�з�������
			constructor.setAccessible(true);
			// �����¶���
			MultitonSingleton instance3 = (MultitonSingleton) constructor.newInstance();

			System.out.print("���䴴��: ");
			if (instance == instance3) {
				System.out.println("ͬһ������");
			} else {
				System.out.println("��ͬ����");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void testSerzi(MultitonSingleton instance) {
		// ͨ�������л���ȡ�����һ������һ����ͬ

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./singleton.txt"));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./singleton.txt"))) {

			oos.writeObject(instance);
			oos.close();
			MultitonSingleton instance4 = (MultitonSingleton) ois.readObject();

			ois.close();
			System.out.println("�����л���ȡ����" + instance4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
