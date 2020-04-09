package com.lushunde.desingn.templatemethod.expand;

public class Client {
	public static void main(String[] args) {
		// XX公司要H1型号的悍马
		HummerH1Model h1 = new HummerH1Model();
		h1.setAlarm(false);
		// H1模型演示
		h1.run();
		h1.setAlarm(true);
		h1.run();

		// XX公司要H2型号的悍马
		HummerModel h2 = new HummerH2Model();
		// H2模型演示
		h2.run();
	}
}
