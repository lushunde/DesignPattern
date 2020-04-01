package com.lushunde.desingn.principle.isp.improve;

public class Client {
	// 搜索并展示美女信息
	public static void main(String[] args) {
		// 定义一个身材美女
		IGoodBodyGirl yanYan = new PettyGirl("嫣嫣");
		AbstractSearcher searcher = new Searcher(yanYan);
		searcher.show();
		// 定义一个气质美女
		IGreatTemperamentGirl fangfang = new PettyGirl("芳芳");
		AbstractSearcher searcher2 = new Searcher(fangfang);
		searcher2.show();

	}

}
