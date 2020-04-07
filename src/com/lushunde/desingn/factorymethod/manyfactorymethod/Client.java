package com.lushunde.desingn.factorymethod.manyfactorymethod;

/**
 * 多个工厂模式,适用于复杂场景或者 创建产品有不同逻辑的产品
 * @author bellus
 *
 */
public class Client {
	public static void main(String[] args) {
		// 创建第一个产品工厂 和产品
		Creator factory1 = new ConcreteCreator1();
		Product product1 = factory1.createProduct();
				
		// 创建第二个产品工厂 和产品
		Creator factory2 = new ConcreteCreator2();
		Product product2 = factory2.createProduct();
		/*
		 * 继续业务处理
		 */

		product1.method2();
		product2.method2();
	}
}
