package com.lushunde.desingn.dip.improve;

public class Client {
	public static void main(String[] args) {
		IDriver zhangSan = new Driver();
		// ���������۳�
		zhangSan.drive(new Benz());
		//����������
		zhangSan.drive(new BMW());
		
	}

}
