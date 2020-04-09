package com.lushunde.desingn.templatemethod.expand;

public abstract class HummerModel {
	/*
	 * ���ȣ����ģ��Ҫ�ܹ��������������������ҡ���������ǵ������������� ��Ҫ�ܹ����������������ʵ��Ҫ��ʵ��������
	 */
	protected abstract void start();

	// �ܷ�������Ҫ��ͣ�������ǲ����汾��
	protected abstract void stop();

	// ���Ȼ���������ǵενУ��������ٽ�
	protected abstract void alarm();

	// ������¡¡���죬�������Ǽٵ�
	protected abstract void engineBoom();

	// ��ģ��Ӧ�û��ܰɣ���������Ƶģ����ǵ��������ģ���֮Ҫ����
	public void run() {
		// �ȷ�������
		this.start();
		// ���濪ʼ����
		this.engineBoom();

		// �Թ��ӷ����ж�
		if (this.isAlarm()) {

			// Ȼ��Ϳ�ʼ���ˣ��ܵĹ���������һ������·���Ͱ�����
			this.alarm();
		}
		// ����Ŀ�ĵؾ�ͣ��
		this.stop();
	}

	// ������¡¡���죬�������Ǽٵ�
	protected abstract boolean isAlarm();

}
