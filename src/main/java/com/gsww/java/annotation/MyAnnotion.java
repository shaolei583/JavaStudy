package com.gsww.java.annotation;

@AnnotationTest(age = 23)
public class MyAnnotion {

	@AnnotationTest(name="guoguo",age=3)
	public void outPut() {
		System.out.println("ÄãºÃ");
	}
}
