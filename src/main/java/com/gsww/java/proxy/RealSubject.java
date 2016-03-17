package com.gsww.java.proxy;

public class RealSubject extends Subject{

	@Override
	public void request() {
		System.out.println("realSubject request");
	}

}
