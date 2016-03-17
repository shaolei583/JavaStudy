package com.gsww.java.annotation;

import java.lang.reflect.Method;


public class MyReflect<T> {

	public static void main(String[] args) throws Exception {
		Class<MyAnnotion> classType = MyAnnotion.class;
		Method method = classType.getDeclaredMethod("outPut",new Class[]{});
		boolean flag =  method.isAnnotationPresent(AnnotationTest.class);
		if(flag){
			AnnotationTest  test = method.getAnnotation(AnnotationTest.class);
			System.out.println(test.age()+","+test.name()); 
		}
	}
}
