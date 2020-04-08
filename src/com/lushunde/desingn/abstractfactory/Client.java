package com.lushunde.desingn.abstractfactory;

public class Client {

	public static void main(String[] args) {
		//�������������
		Creator creator1 = new ConcreteCreator1();
		Creator creator2 = new ConcreteCreator2();
		//����A1����
		ProductA _1a = creator1.createProductA();
		//����A2����
		ProductA _2a = creator2.createProductA();
		//����B1����
		ProductB _1b = creator1.createProductB();
		//����B2����
		ProductB _2b = creator2.createProductB();
		
		_1a.methodA();
		_1b.methodB();
		_2a.methodA();
		_2b.methodB();
	}

}
