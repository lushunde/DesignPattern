package com.lushunde.desingn.principle.dip;

public class Driver {
	// 司机的主要职责就是驾驶汽车
	public void drive(Benz benz) {
		benz.run();
	}
}
