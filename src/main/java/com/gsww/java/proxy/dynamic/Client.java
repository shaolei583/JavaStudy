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
		// 下面的代码一次性生成代理类
		Subject subject = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), handler);
		//subject为代理类，在执行下面的方法的时间。执行invoke方法
		subject.request();
	}

}
