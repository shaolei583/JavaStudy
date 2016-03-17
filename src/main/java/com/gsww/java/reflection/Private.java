package com.gsww.java.reflection;

public class Private{

	private String name = "ÉÛÀÚ";

	private String sayHello(String str) {
		return "Hello" + str;
	}

	public String getName() {
		return name;
	}
}
