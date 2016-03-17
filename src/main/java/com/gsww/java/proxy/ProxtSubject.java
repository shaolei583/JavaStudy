package com.gsww.java.proxy;

public class ProxtSubject extends Subject {

	private RealSubject realSubject;

	@Override
	public void request() {
		if(null ==realSubject){
			realSubject = new RealSubject();
		}
		realSubject.request();
	}
}
