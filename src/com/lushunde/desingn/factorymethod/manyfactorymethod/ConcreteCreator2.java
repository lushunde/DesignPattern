package com.lushunde.desingn.factorymethod.manyfactorymethod;

public class ConcreteCreator2 extends Creator  {
	@SuppressWarnings("unchecked")
	public  <T extends Product> T createProduct() {
		Product product = null;
		try {
			product = new ConcreteProduct2();
		} catch (Exception e) {
			// �쳣����
		}
		return (T) product;
	}
}
