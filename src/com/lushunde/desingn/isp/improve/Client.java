package com.lushunde.desingn.isp.improve;

public class Client {
	// ������չʾ��Ů��Ϣ
	public static void main(String[] args) {
		// ����һ�������Ů
		IGoodBodyGirl yanYan = new PettyGirl("����");
		AbstractSearcher searcher = new Searcher(yanYan);
		searcher.show();
		// ����һ��������Ů
		IGreatTemperamentGirl fangfang = new PettyGirl("����");
		AbstractSearcher searcher2 = new Searcher(fangfang);
		searcher2.show();

	}

}
