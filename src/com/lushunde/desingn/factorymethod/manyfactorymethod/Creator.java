package com.lushunde.desingn.factorymethod.manyfactorymethod;

public abstract class Creator {
	/*
	 * ����һ����Ʒ����������������Ϳ����������� ͨ��ΪString��Enum��Class�ȣ���ȻҲ����Ϊ��
	 */
	public abstract <T extends Product> T createProduct();
}
