package com.gsww.java.proxy.listproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListProxy implements InvocationHandler {

	private Object proxyObject;

	public ListProxy(Object proxyObject) {
		this.proxyObject = proxyObject;
	}

	public static Object factory(Object object) {
		Class<?> classType = object.getClass();
		return Proxy.newProxyInstance(classType.getClassLoader(), classType.getInterfaces(), new ListProxy(object));
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Before calling:" + method);
		if (null != args) {
			for (Object object : args) {
				System.out.println("arg:" + object);
			}
		}
		Object obj = method.invoke(proxyObject, args);
		System.out.println("After calling:" + method);
		return obj;
	}
	@SuppressWarnings({"unchecked","rawtypes"})
	public static void main(String[] args) {
		List list  = (List)factory(new ArrayList());
		list.add("shao");
		list.add("lei");
		System.out.println(list);
	}

}
