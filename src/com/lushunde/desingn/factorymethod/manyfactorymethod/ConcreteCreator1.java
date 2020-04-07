package com.lushunde.desingn.factorymethod.manyfactorymethod;

public class ConcreteCreator1 extends Creator  {
	@SuppressWarnings("unchecked")
	public  <T extends Product> T createProduct() {
		Product product = null;
		try {
			product = new ConcreteProduct1();
		} catch (Exception e) {
			// “Ï≥£¥¶¿Ì
		}
		return (T) product;
	}
}
