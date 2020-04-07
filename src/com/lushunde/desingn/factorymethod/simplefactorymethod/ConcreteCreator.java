package com.lushunde.desingn.factorymethod.simplefactorymethod;

public class ConcreteCreator  {
	@SuppressWarnings("unchecked")
	public static <T extends Product> T createProduct(Class<T> c) {
		Product product = null;
		try {
			product = (Product) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			// “Ï≥£¥¶¿Ì
		}
		return (T) product;
	}
}
