package com.lushunde.desingn.principle.lod;

import java.util.Random;

public class Wizard {
	private Random rand = new Random(System.currentTimeMillis());

	// ��һ��
	public int first() {
		System.out.println("ִ�е�һ������...");
		return rand.nextInt(100);
	}

	// �ڶ���
	public int second() {
		System.out.println("ִ�еڶ�������...");
		return rand.nextInt(100);
	}

	// ����������
	public int third() {
		System.out.println("ִ�е���������...");
		return rand.nextInt(100);
	}
}
