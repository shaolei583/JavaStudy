package com.gsww.java.reflection;

import java.lang.reflect.Method;

public class DumpMethods {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> classType = Class.forName("com.gsww.java.other.Common");
		Method[]  methods = classType.getDeclaredMethods();
		for(Method method:methods){
			System.out.println(method);
		}
	}
}
