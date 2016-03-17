package com.gsww.java.reflection;

import java.lang.reflect.Array;

public class ArrayTest {

	public static void main(String[] args) throws Exception {
		Class<?> classType = Class.forName("java.lang.String");
		Object array = Array.newInstance(classType,10);
		Array.set(array,5,"Hello");
		String str = (String)Array.get(array,5);
		System.out.println(str);
	}
}
