package com.gsww.java.proxy.dynamic;

/**
 * ��ʵ�Ķ���
 * 
 * @author shaol
 * 
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println(" from real subject ��");
	}

}
