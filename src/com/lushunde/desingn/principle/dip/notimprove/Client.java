package com.lushunde.desingn.principle.dip.notimprove;

public class Client {
	public static void main(String[] args) {
		Driver zhangSan = new Driver();
		Benz benz = new Benz();
		// ���������۳�
		zhangSan.drive(benz);
		
		Driver2 zhangSan2 = new Driver2();
		BMW bmw = new BMW();
		//����������
		zhangSan2.drive(bmw);
		
	}

}
