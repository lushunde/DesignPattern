package com.lushunde.desingn.principle.srp.improve;

/**
 * �绰ͨ����ʱ����4�����̷��������š�ͨ�����һ�3�����ܣ����ݵ�һְ����Ƹ���Ŀ��
 * @author bellus
 * 
 * ʵ���˽ӿڵ�һԭ�򣬵�����Υ���˸�ԭ����Ҳ�����ʵ��
 */

public class Client {
	public static void main(String[] args) {
		IConnectionManager phone = new Phone();
		phone.dial("010-25452154");
		IDataTransfer data= (IDataTransfer)phone;
		data.chat("ͨ�����ݴ�����");
		phone.hangup();
	}

}
