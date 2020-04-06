package com.lushunde.desingn.singleton.improve;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 有上限的多例模式 测试 正常调用 反射漏洞 反序列化漏洞
 * 
 * @author bellus
 *
 */

public class MultitonClient6 {

	public static void main(String[] args) {

		MultitonSingleton instance = MultitonSingleton.getInstance();

		// 多次调用，查看有多少对象
		test1();
		// 实现反射创建新对象
		testReflect(instance);
		// 通过反序列化
		testSerzi(instance);

	}

	private static void test1() {
		// 调用10次，查看对象
		MultitonSingleton instance = null;
		for (int i = 0; i < 10; i++) {
			instance = MultitonSingleton.getInstance();
			System.out.println(instance);
		}

	}

	private static void testReflect(MultitonSingleton instance) {
		try {

			// 实现反射创建新对象
			Class<?> classType = Singleton5.class;
			Class<?>[] cArg = new Class[0]; // 入参类型（空参）
			// 获取 构造方法 类
			Constructor<?> constructor = classType.getDeclaredConstructor(cArg);
			// 打开 私有方法开关
			constructor.setAccessible(true);
			// 创建新对象
			MultitonSingleton instance3 = (MultitonSingleton) constructor.newInstance();

			System.out.print("反射创建: ");
			if (instance == instance3) {
				System.out.println("同一个对象");
			} else {
				System.out.println("不同对象");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void testSerzi(MultitonSingleton instance) {
		// 通过反序列化获取对象和一中其中一个相同

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./singleton.txt"));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./singleton.txt"))) {

			oos.writeObject(instance);
			oos.close();
			MultitonSingleton instance4 = (MultitonSingleton) ois.readObject();

			ois.close();
			System.out.println("反序列化获取对象：" + instance4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
