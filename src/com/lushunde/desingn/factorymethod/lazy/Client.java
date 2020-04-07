package com.lushunde.desingn.factorymethod.lazy;

/**
 * �ӳٳ�ʼ�� һ������������Ϻ󣬲��������ͷţ������ౣ�����ʼ״̬���ȴ��ٴα�ʹ��.
 * 
 * @author bellus
 *
 */
public class Client {
	public static void main(String[] args) throws Exception {

		// ������һ����Ʒ
		Product product1 = ProductFactory.createProduct("product1");
		Product product2 = ProductFactory.createProduct("product1");
		Product product3 = ProductFactory.createProduct("product");

		product1.method2();
		product2.method2();
		product3.method2();

		if (product1 == product2) {
			System.out.println("���λ�ȡ��ͬһ������ʹ���˻��� ");
		} else {
			System.out.println("���λ�ȡ�Ĳ�ͬ����ʹ���˻��� ");
		}
	}
}
