package com.gsww.java.proxy;

public class Client {

	public static void main(String[] args) {
		Subject subject = new ProxtSubject();
		subject.request();
		
	}
}
