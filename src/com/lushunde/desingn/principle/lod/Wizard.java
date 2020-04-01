package com.lushunde.desingn.principle.lod;

import java.util.Random;

public class Wizard {
	private Random rand = new Random(System.currentTimeMillis());

	// 第一步
	public int first() {
		System.out.println("执行第一个方法...");
		return rand.nextInt(100);
	}

	// 第二步
	public int second() {
		System.out.println("执行第二个方法...");
		return rand.nextInt(100);
	}

	// 第三个方法
	public int third() {
		System.out.println("执行第三个方法...");
		return rand.nextInt(100);
	}
}
