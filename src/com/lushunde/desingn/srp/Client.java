package com.lushunde.desingn.srp;

/**
 * �绰ͨ����ʱ����4�����̷��������š�ͨ�����һ�3�����ܣ����ݵ�һְ����Ƹ���Ŀ��
 * @author bellus
 *
 */

public class Client {
	public static void main(String[] args) {
		IPhone phone = new Phone();
		phone.dial("010-25452154");
		phone.chat("ͨ�����ݴ�����");
		phone.hangup();
	}

}
