package com.gsww.java.proxy.dynamic;

/**
 * 真实的对象
 * 
 * @author shaol
 * 
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println(" from real subject ！");
	}

}
