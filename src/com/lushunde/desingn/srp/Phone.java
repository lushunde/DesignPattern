package com.lushunde.desingn.srp;

public class Phone implements IPhone {

	@Override
	public void dial(String phoneNumber) {

		System.out.println("���ţ�" + phoneNumber);

	}

	@Override
	public void chat(Object o) {
		// TODO Auto-generated method stub
		System.out.println("ͨ�����ݴ������ݣ�" + o.toString());
	}

	@Override
	public void hangup() {
		// TODO Auto-generated method stub
		System.out.println("�Ҷϵ绰");
	}

}
