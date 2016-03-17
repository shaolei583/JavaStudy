package com.gsww.java.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * �������
 * @author shaol
 * �ô�������ڲ�����ΪObject���ͣ�ʵ��ʹ�õ�ʱ��ͨ������Ĺ��췽��������һ������
 * ���⣬���໹ʵ����invoke�������÷����е�method.invoke��ʵ���ǵ��ñ��������Ҫִ�еķ���
 * ��������sub��ʾ�÷���������sub��ͨ����̬�����࣬���ǿ�����ִ�����Ķ���ķ���ǰ����������Լ���һЩ����ķ���
 */
public class DynamicSubject implements InvocationHandler {

	private Object sub;
	
	public DynamicSubject(Object sub) {
		this.sub = sub;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before calling:"+method);
		
		method.invoke(sub,args);
		
		System.out.println("after calling:"+method);
		return null;
	}

}
