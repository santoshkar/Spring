package com.learning;

public class MyCurrency {
	
	private String currencyType;
	
	public void initMethod() {
		System.out.println("The bean is created.....");
	}

	public void destroyMethod() {
		System.out.println("destroying bean.........");
	}
	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}
	
	

}
