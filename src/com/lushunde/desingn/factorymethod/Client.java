package com.lushunde.desingn.factorymethod;

public class Client {
	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		Product product1 = creator.createProduct(ConcreteProduct1.class);
		Product product2 = creator.createProduct(ConcreteProduct2.class);
		/*
		 * 继续业务处理
		 */

		product1.method2();
		product2.method2();
	}
}
