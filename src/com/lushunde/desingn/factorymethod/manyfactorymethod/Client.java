package com.lushunde.desingn.factorymethod.manyfactorymethod;

/**
 * �������ģʽ,�����ڸ��ӳ������� ������Ʒ�в�ͬ�߼��Ĳ�Ʒ
 * @author bellus
 *
 */
public class Client {
	public static void main(String[] args) {
		// ������һ����Ʒ���� �Ͳ�Ʒ
		Creator factory1 = new ConcreteCreator1();
		Product product1 = factory1.createProduct();
				
		// �����ڶ�����Ʒ���� �Ͳ�Ʒ
		Creator factory2 = new ConcreteCreator2();
		Product product2 = factory2.createProduct();
		/*
		 * ����ҵ����
		 */

		product1.method2();
		product2.method2();
	}
}
