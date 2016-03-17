package com.gsww.java.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		RealSubject realSubject = new RealSubject();

		InvocationHandler handler = new DynamicSubject(realSubject);
		// ����Ĵ���һ�������ɴ�����
		Subject subject = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), handler);
		//subjectΪ�����࣬��ִ������ķ�����ʱ�䡣ִ��invoke����
		subject.request();
	}

}
