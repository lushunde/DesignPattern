package com.lushunde.desingn.factorymethod.lazy;

/**
 * 延迟初始化 一个对象被消费完毕后，并不立刻释放，工厂类保持其初始状态，等待再次被使用.
 * 
 * @author bellus
 *
 */
public class Client {
	public static void main(String[] args) throws Exception {

		// 创建第一个产品
		Product product1 = ProductFactory.createProduct("product1");
		Product product2 = ProductFactory.createProduct("product1");
		Product product3 = ProductFactory.createProduct("product");

		product1.method2();
		product2.method2();
		product3.method2();

		if (product1 == product2) {
			System.out.println("两次获取的同一个对象，使用了缓存 ");
		} else {
			System.out.println("两次获取的不同对象，使用了缓存 ");
		}
	}
}
