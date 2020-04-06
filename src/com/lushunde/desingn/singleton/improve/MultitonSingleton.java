package com.lushunde.desingn.singleton.improve;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * 扩展：有上限的多例模式 **含义：**
 * 产生固定数量对象的模式就叫做有上限的多例模式，它是单例模式的一种扩展，采用有上限的多例模式，我们可以在设计时决定在内存中有多少个实例，方便系统进行扩展，
 * 修正单例可能存在的性能问题，提供系统的响应速度。 **常用场景**： 读取文件，设置多个固定提高并发量，继而提升性能和响应速度。
 * 
 * @author bellus
 *
 */
public class MultitonSingleton implements Serializable {

	private static final long serialVersionUID = -7640246007296163797L;

	// 定义最多能产生的实例的数量
	private static int maxNumOfMultiton = 2;

	// 定义一个列表，容纳所有实例
	private static ArrayList<MultitonSingleton> SingletonList = new ArrayList<MultitonSingleton>();
	// 当前实例的序列号
	private static int countNumOfMultiton = 0;

	// 产生所有对象
	static {
		for (int i = 0; i < maxNumOfMultiton; i++) {
			SingletonList.add(new MultitonSingleton());
		}
	}

	private MultitonSingleton() {
		// 解决反射创建对象，直接抛异常
		if (SingletonList.size() > maxNumOfMultiton) {
			throw new RuntimeException("创建数已达到最大数，防止反射创建对象");
		}
	}

	// 随机获得一个皇帝对象
	public static MultitonSingleton getInstance() {
		Random random = new Random();
		countNumOfMultiton = random.nextInt(maxNumOfMultiton);
		return SingletonList.get(countNumOfMultiton);
	}

	// 类中其他方法，尽量是static
	public static void doSomething() {

	}

	// 解决反序列化漏洞
	public Object readResolve() throws ObjectStreamException {
		return SingletonList.get(countNumOfMultiton);
	}

}
