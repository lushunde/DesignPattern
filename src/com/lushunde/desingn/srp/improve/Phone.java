package com.lushunde.desingn.srp.improve;

public class Phone implements IDataTransfer, IConnectionManager {
	@Override
	public void dial(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("���ţ�" + phoneNumber);
	}

	@Override
	public void hangup() {
		// TODO Auto-generated method stub
		System.out.println("�Ҷϵ绰");
	}

	@Override
	public void chat(Object o) {
		// TODO Auto-generated method stub
		System.out.println("ͨ�����ݴ������ݣ�" + o.toString());
	}

}
