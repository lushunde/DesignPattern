package com.lushunde.desingn.principle.srp;

public class Phone implements IPhone {

	@Override
	public void dial(String phoneNumber) {

		System.out.println("拨号：" + phoneNumber);

	}

	@Override
	public void chat(Object o) {
		// TODO Auto-generated method stub
		System.out.println("通话数据传输内容：" + o.toString());
	}

	@Override
	public void hangup() {
		// TODO Auto-generated method stub
		System.out.println("挂断电话");
	}

}
