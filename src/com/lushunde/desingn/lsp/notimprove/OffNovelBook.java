package com.lushunde.desingn.lsp.notimprove;

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

	// ��д�۸񷽷������۸����40���ʹ�8���������۸�ʹ�9��
	@Override
	public Double getPrice() {

		return super.getPrice() * 0.8;

	}
}