package com.lushunde.desingn.isp;

/**
 * ��Ůʵ��
 * @author bellus
 *
 */

public class PettyGirl implements IPettyGirl {
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
