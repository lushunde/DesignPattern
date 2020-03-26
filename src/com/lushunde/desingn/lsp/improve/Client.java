package com.lushunde.desingn.lsp.improve;

/**
 * 以图书销售为例
 * 
 * @author bellus
 *
 */

public class Client {
	public static void main(String[] args) {

		IBook novel = new NovelBook("笑傲江湖", 100d, "金庸");
		System.out.println("书籍名字：" + novel.getName() + "书籍作者：" + novel.getAuthor() + "书籍价格：" + novel.getPrice());
		IBook offnovel = new OffNovelBook("笑傲江湖", 100d, "金庸");
		System.out.println("书籍名字：" + offnovel.getName() + "书籍作者：" + offnovel.getAuthor() + "书籍价格：" + offnovel.getPrice());
		IBook offnovel2 = new OffNovelBook("笑傲江湖", 100d, "金庸");
		System.out.println("书籍名字：" + offnovel2.getName() + "书籍作者：" + offnovel2.getAuthor() + "书籍打折价格：" + ((OffNovelBook) offnovel2).getOffPrice());
	}

}
