package com.lushunde.desingn.principle.lsp.improve;

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

	// 不覆写父类价格方法，子类拥有属于自己的打折方法。当价格大于40，就打8析，其他价格就打9析
	public Double getOffPrice() {

		return super.getPrice() * 0.8;

	}
}