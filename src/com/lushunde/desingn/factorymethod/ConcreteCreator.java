package com.lushunde.desingn.factorymethod;

public class ConcreteCreator extends Creator {
	@SuppressWarnings("unchecked")
	public <T extends Product> T createProduct(Class<T> c) {
		Product product = null;
		try {
			product = (Product) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			// “Ï≥£¥¶¿Ì
		}
		return (T) product;
	}
}
