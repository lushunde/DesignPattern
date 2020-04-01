package com.lushunde.desingn.principle.lod.improve;

public class Client {
	public static void main(String[] args) {
		InstallSoftware invoker = new InstallSoftware();
		invoker.installWizard(new Wizard());
	}
}
