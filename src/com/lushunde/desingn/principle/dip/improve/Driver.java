package com.lushunde.desingn.principle.dip.improve;

public class Driver implements IDriver{
	// ˾������Ҫְ����Ǽ�ʻ����
	public void drive(ICar car) {
		car.run();
	}

}
