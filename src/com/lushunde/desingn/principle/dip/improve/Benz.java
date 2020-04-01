package com.lushunde.desingn.principle.dip.improve;

public class Benz implements ICar{
	// 汽车肯定会跑
	@Override
	public void run() {
		System.out.println("奔驰汽车开始运行...");
	}
}
