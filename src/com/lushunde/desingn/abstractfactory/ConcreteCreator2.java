package com.lushunde.desingn.abstractfactory;

public class ConcreteCreator2 extends Creator {

	@Override
	public ProductA createProductA() {
		return new ConcreteProductA2();
	}

	@Override
	public ProductB createProductB() {
		// TODO Auto-generated method stub
		return new ConcreteProductB2();
	}

}
