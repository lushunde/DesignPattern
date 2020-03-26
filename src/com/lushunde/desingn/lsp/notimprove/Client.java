package com.lushunde.desingn.lsp.notimprove;


/**
 * 以图书销售为例
 * 
 * 里氏代换原则  任何父类的地方都可以实用子列替换，上一次的 开闭原则 例子的油壶实际违反 里氏代换原则
 * 可以看到  子类覆盖了父类价格方法，所以替换后结果不同
 * @author bellus
 * 	本例修改实现类
 */

public class Client {
	public static void main(String[] args) {

		IBook novel = new NovelBook("笑傲江湖", 100d, "金庸");
		System.out.println("书籍名字：" + novel.getName() + "书籍作者：" + novel.getAuthor() + "书籍价格：" + novel.getPrice());
		IBook offnovel = new OffNovelBook("笑傲江湖", 100d, "金庸");
		System.out.println("书籍名字：" + offnovel.getName() + "书籍作者：" + offnovel.getAuthor() + "书籍价格：" + offnovel.getPrice());
	}

}
