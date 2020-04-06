package com.lushunde.desingn.singleton.improve;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 测试 正常调用
 * 反射漏洞
 * 反序列化漏洞
 * @author bellus
 *
 */

public class Client {

	public static void main(String[] args) {

		
		
		Singleton singleton = Singleton.getSingleton();

		// 调用两次
		test1(singleton);
		// 实现反射创建新对象
		testReflect(singleton);
		// 通过反序列化
		testSerzi(singleton);

	}

	private static void test1(Singleton singleton) {
		// 调用两次，查看是否同一个对象
		Singleton singleton2 = Singleton.getSingleton();
		System.out.print("正常创建: ");
		if (singleton == singleton2) {
			System.out.println("同一个对象");
		} else {
			System.out.println("不同对象");
		}
	}

	private static void testReflect(Singleton singleton) {
		try {

			// 实现反射创建新对象
			Class<?> classType = Singleton.class;
			Class<?>[] cArg = new Class[0]; // 入参类型（空参）
			// 获取 构造方法 类
			Constructor<?> constructor = classType.getDeclaredConstructor(cArg);
			// 打开 私有方法开关
			constructor.setAccessible(true);
			// 创建新对象
			Singleton singleton3 = (Singleton) constructor.newInstance();

			System.out.print("反射创建: ");
			if (singleton == singleton3) {
				System.out.println("同一个对象");
			} else {
				System.out.println("不同对象");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void testSerzi(Singleton singleton) {
		// 通过反序列化

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./singleton.txt"));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./singleton.txt"))) {

			oos.writeObject(singleton);
			oos.close();
			Singleton singleton4 = (Singleton) ois.readObject();

			ois.close();
			System.out.print("反序列化创建: ");
			if (singleton == singleton4) {
				System.out.println("同一个对象");
			} else {
				System.out.println("不同对象");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
