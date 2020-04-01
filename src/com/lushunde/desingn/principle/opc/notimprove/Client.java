package com.lushunde.desingn.principle.opc.notimprove;

/**
 * 以图书销售为例
 * 
 * 原来： 直接原价销售
 * 新需求： 运价打8折出售
 * 		1. 修改接口
 * 		2. 修改实现类
 * 	改进：通过扩展新实现
 * @author bellus
 * 	本例修改实现类
 */

public class Client {
	public static void main(String[] args) {

		IBook novel = new NovelBook("笑傲江湖", 100, "金庸");
		System.out.println("书籍名字：" + novel.getName() + "书籍作者：" + novel.getAuthor() + "书籍价格：" + novel.getPrice());
	}

}
