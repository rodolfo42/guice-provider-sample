package com.github.rodolfo42.guiceprovidersample;

import com.google.inject.Provider;

public class MyInterfaceProvider implements Provider<MyClass> {
	
	@Override
	public MyClass get() {
		return new MyClass(getClass().getSimpleName());
	}
	
}
