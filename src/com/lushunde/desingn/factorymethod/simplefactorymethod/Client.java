package com.lushunde.desingn.factorymethod.simplefactorymethod;

/**
 * 一个模块仅需要一个工厂类，没有必要把它产生出来，使用静态的方法就可以了，
 * @author bellus
 *
 */
public class Client {
	public static void main(String[] args) {
		Product product1 = ConcreteCreator.createProduct(ConcreteProduct1.class);
		Product product2 = ConcreteCreator.createProduct(ConcreteProduct2.class);
		/*
		 * 继续业务处理
		 */

		product1.method2();
		product2.method2();
	}
}
