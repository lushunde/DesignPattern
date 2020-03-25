package com.lushunde.desingn.opc.notimprove;


/**
 * С˵ͼ��
 * @author bellus
 * ��������  ʹ���޸�ʵ���෽ʽ
 */

public class NovelBook implements IBook {

	private String name;
	private double price;
	private String author;

	public NovelBook(String name, double price, String author) {
		this.name = name;
		this.price = price;
		this.author = author;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Double getPrice() {
		return this.price*0.8;
	}

	@Override
	public String getAuthor() {
		return this.author;
	}

}
