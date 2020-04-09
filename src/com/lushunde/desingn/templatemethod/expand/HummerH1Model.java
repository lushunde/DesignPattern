package com.lushunde.desingn.templatemethod.expand;

public class HummerH1Model extends HummerModel {
	private boolean alarmFlag = true; // Ҫ������

	// H1�ͺŵĺ�������
	@Override
	protected void alarm() {
		System.out.println("����H1����...");
	}

	// ���������
	@Override
	protected void engineBoom() {
		System.out.println("����H1����������������...");
	}

	// ��������
	@Override
	protected void start() {
		System.out.println("����H1����...");
	}

	// ͣ��
	@Override
	protected void stop() {
		System.out.println("����H1ͣ��...");
	}

	// ��ȡ�û����õ�����
	@Override
	protected boolean isAlarm() {
		return this.alarmFlag;
	}

	// Ҫ��Ҫ�����ȣ����ɿͻ���������
	public void setAlarm(boolean isAlarm) {
		this.alarmFlag = isAlarm;
	}

}
