package com.lushunde.desingn.templatemethod.expand;

public class HummerH2Model extends HummerModel {
	// H2型号的悍马车鸣笛
	@Override
	protected void alarm() {
		System.out.println("悍马H2鸣笛...");
	}

	// 引擎轰鸣声
	@Override
	protected void engineBoom() {
		System.out.println("悍马H2引擎声音是这样在...");
	}

	// 汽车发动
	@Override
	protected void start() {
		System.out.println("悍马H2发动...");
	}

	// 停车
	@Override
	protected void stop() {
		System.out.println("悍马H2停车...");
	}

	//// 默认没有喇叭的
	@Override
	protected boolean isAlarm() {
		return false;
	}

}
