package com.lushunde.desingn.lsp.improve;

/**
 * С˵ͼ�� 8����ʵ����
 * 
 * @author bellus
 * 
 */
public class OffNovelBook extends NovelBook {

	public OffNovelBook(String name, Double price, String author) {
		super(name, price, author);
	}

	// ����д����۸񷽷�������ӵ�������Լ��Ĵ��۷��������۸����40���ʹ�8���������۸�ʹ�9��
	public Double getOffPrice() {

		return super.getPrice() * 0.8;

	}
}