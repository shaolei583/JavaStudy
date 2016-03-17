package com.gsww.java.reflection;

import java.lang.reflect.Method;

public class Invoke {

	public int add(int a, int b) {
		return a + b;
	}

	public String echo(String message) {
		return "Welcome " + message;
	}

	public static void main(String[] args) throws Exception {
		Class<Invoke> classType = Invoke.class;
		Invoke invoke = classType.newInstance();
		Method addMethod = classType.getMethod("add", new Class[] {int.class,int.class});
		Object result = addMethod.invoke(invoke,new Object[]{1,2});
		System.out.println(result);
		System.out.println("**********************");
		Method echoMethod = classType.getMethod("echo",new Class[]{String.class});
		Object result2 = echoMethod.invoke(invoke,new Object[]{"lanzhou!"});
		System.out.println(result2);
		
	}
}
