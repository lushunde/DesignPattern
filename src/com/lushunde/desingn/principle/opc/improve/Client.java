package com.lushunde.desingn.principle.opc.improve;

/**
 * 以图书销售为例
 * @author bellus
 *
 */

public class Client {
	public static void main(String[] args) {

		IBook novel = new OffNovelBook("笑傲江湖", 100d, "金庸");
		System.out.println("书籍名字：" + novel.getName() + "书籍作者：" + novel.getAuthor() + "书籍价格：" + novel.getPrice());
	}

}
