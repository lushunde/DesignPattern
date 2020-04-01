package com.lushunde.desingn.principle.opc.improve;

/**
 * 小说图书 8打折实现类
 * 
 * @author bellus
 * 
 */
public class OffNovelBook extends NovelBook {

	public OffNovelBook(String name, Double price, String author) {
		super(name, price, author);
	}

	// 覆写价格方法，当价格大于40，就打8析，其他价格就打9析
	@Override
	public Double getPrice() {

		return super.getPrice() * 0.8;

	}
}