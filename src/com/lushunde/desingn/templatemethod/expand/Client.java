package com.lushunde.desingn.templatemethod.expand;

public class Client {
	public static void main(String[] args) {
		// XX��˾ҪH1�ͺŵĺ���
		HummerH1Model h1 = new HummerH1Model();
		h1.setAlarm(false);
		// H1ģ����ʾ
		h1.run();
		h1.setAlarm(true);
		h1.run();

		// XX��˾ҪH2�ͺŵĺ���
		HummerModel h2 = new HummerH2Model();
		// H2ģ����ʾ
		h2.run();
	}
}
