package com.lushunde.desingn.isp.improve;

public class PettyGirl implements IGoodBodyGirl,IGreatTemperamentGirl {
	private String name;

	// ��Ů��������
	public PettyGirl(String _name) {
		this.name = _name;
	}

	// ����Ư��
	public void goodLooking() {
		System.out.println(this.name + "---������Ư��!");
	}

	// ����Ҫ��
	public void greatTemperament() {
		System.out.println(this.name + "---���ʷǳ���!");
	}

	// ���Ҫ��
	public void niceFigure() {
		System.out.println(this.name + "---��ķǳ���!");
	}
}
