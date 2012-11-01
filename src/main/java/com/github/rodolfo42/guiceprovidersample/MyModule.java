package com.github.rodolfo42.guiceprovidersample;

import com.google.inject.AbstractModule;

public class MyModule extends AbstractModule {
	
	@Override
	protected void configure() {
		bind(MyInterface.class).toProvider(MyInterfaceProvider.class);
	}
	
}
