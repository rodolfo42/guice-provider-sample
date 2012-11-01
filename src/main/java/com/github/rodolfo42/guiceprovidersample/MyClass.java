package com.github.rodolfo42.guiceprovidersample;

public class MyClass implements MyInterface {
	
	private String providerName;
	
	public MyClass(String providerName) {
		this.providerName = providerName;
	}

	@Override
	public String foobar() {
		return String.format("Hi! I am [%s], " + "and I was instantiated using [%s]", getClass().getSimpleName(), providerName);
	}
	
}
