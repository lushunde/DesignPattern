package com.lushunde.desingn.abstractfactory;

public class Client {

	public static void main(String[] args) {
		//定义出两个工厂
		Creator creator1 = new ConcreteCreator1();
		Creator creator2 = new ConcreteCreator2();
		//产生A1对象
		ProductA _1a = creator1.createProductA();
		//产生A2对象
		ProductA _2a = creator2.createProductA();
		//产生B1对象
		ProductB _1b = creator1.createProductB();
		//产生B2对象
		ProductB _2b = creator2.createProductB();
		
		_1a.methodA();
		_1b.methodB();
		_2a.methodA();
		_2b.methodB();
	}

}
