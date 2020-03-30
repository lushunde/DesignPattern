package com.lushunde.desingn.dip.improve;

public class Client {
	public static void main(String[] args) {
		IDriver zhangSan = new Driver();
		// 张三开奔驰车
		zhangSan.drive(new Benz());
		//张三开宝马
		zhangSan.drive(new BMW());
		
	}

}
