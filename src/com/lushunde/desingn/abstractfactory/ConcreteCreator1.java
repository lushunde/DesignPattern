package com.lushunde.desingn.abstractfactory;

public class ConcreteCreator1 extends Creator {

	@Override
	public ProductA createProductA() {
		return new ConcreteProductA1();
	}

	@Override
	public ProductB createProductB() {
		// TODO Auto-generated method stub
		return new ConcreteProductB1();
	}

}
