package com.lushunde.desingn.templatemethod;

public class Client {
	public static void main(String[] args) {
		// XX��˾ҪH1�ͺŵĺ���
		HummerModel h1 = new HummerH1Model();
		// H1ģ����ʾ
		h1.run();
		// XX��˾ҪH2�ͺŵĺ���
		HummerModel h2 = new HummerH2Model();
		// H2ģ����ʾ
		h2.run();
	}
}
