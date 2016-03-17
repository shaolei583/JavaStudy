package com.gsww.java.design.pattern;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void getObject() {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton == singleton2);
	}
}
