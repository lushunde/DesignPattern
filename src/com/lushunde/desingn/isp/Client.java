package com.lushunde.desingn.isp;

public class Client {
	// ������չʾ��Ů��Ϣ
	public static void main(String[] args) {
		// ����һ����Ů
		IPettyGirl yanYan = new PettyGirl("����");
		AbstractSearcher searcher = new Searcher(yanYan);
		searcher.show();
	}

}
