package com.lushunde.desingn.principle.lod;

public class InstallSoftware {
	public void installWizard(Wizard wizard) {
		int first = wizard.first();
		// ����first���صĽ�������Ƿ���Ҫִ��second
		if (first > 50) {
			int second = wizard.second();
			if (second > 50) {
				int third = wizard.third();
				if (third > 50) {
					wizard.first();
				}
			}
		}
	}

}
