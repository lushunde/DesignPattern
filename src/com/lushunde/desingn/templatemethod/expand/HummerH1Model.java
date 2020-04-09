package com.lushunde.desingn.templatemethod.expand;

public class HummerH1Model extends HummerModel {
	private boolean alarmFlag = true; // 要响喇叭

	// H1型号的悍马车鸣笛
	@Override
	protected void alarm() {
		System.out.println("悍马H1鸣笛...");
	}

	// 引擎轰鸣声
	@Override
	protected void engineBoom() {
		System.out.println("悍马H1引擎声音是这样在...");
	}

	// 汽车发动
	@Override
	protected void start() {
		System.out.println("悍马H1发动...");
	}

	// 停车
	@Override
	protected void stop() {
		System.out.println("悍马H1停车...");
	}

	// 获取用户设置的喇叭
	@Override
	protected boolean isAlarm() {
		return this.alarmFlag;
	}

	// 要不要响喇叭，是由客户来决定的
	public void setAlarm(boolean isAlarm) {
		this.alarmFlag = isAlarm;
	}

}
