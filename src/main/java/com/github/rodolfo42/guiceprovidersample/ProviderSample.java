package com.github.rodolfo42.guiceprovidersample;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ProviderSample {
	
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new MyModule());
		MyInterface myObject = injector.getInstance(MyInterface.class);
		
		System.out.println(myObject.foobar());
	}
}
