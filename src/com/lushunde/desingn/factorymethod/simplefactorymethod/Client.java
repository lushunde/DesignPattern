package com.lushunde.desingn.factorymethod.simplefactorymethod;

/**
 * һ��ģ�����Ҫһ�������࣬û�б�Ҫ��������������ʹ�þ�̬�ķ����Ϳ����ˣ�
 * @author bellus
 *
 */
public class Client {
	public static void main(String[] args) {
		Product product1 = ConcreteCreator.createProduct(ConcreteProduct1.class);
		Product product2 = ConcreteCreator.createProduct(ConcreteProduct2.class);
		/*
		 * ����ҵ����
		 */

		product1.method2();
		product2.method2();
	}
}
