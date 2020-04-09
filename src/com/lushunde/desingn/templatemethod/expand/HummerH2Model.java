package com.lushunde.desingn.templatemethod.expand;

public class HummerH2Model extends HummerModel {
	// H2�ͺŵĺ�������
	@Override
	protected void alarm() {
		System.out.println("����H2����...");
	}

	// ���������
	@Override
	protected void engineBoom() {
		System.out.println("����H2����������������...");
	}

	// ��������
	@Override
	protected void start() {
		System.out.println("����H2����...");
	}

	// ͣ��
	@Override
	protected void stop() {
		System.out.println("����H2ͣ��...");
	}

	//// Ĭ��û�����ȵ�
	@Override
	protected boolean isAlarm() {
		return false;
	}

}
