package com.gsww.java.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 代理对象
 * @author shaol
 * 该代理类的内部属性为Object类型，实际使用的时候通过该类的构造方法传进来一个对象
 * 此外，该类还实现了invoke方法，该方法中的method.invoke其实就是调用被代理对象将要执行的方法
 * 方法参数sub表示该方法从属于sub，通过动态代理类，我们可以在执行真心对象的方法前后加入我们自己的一些额外的方法
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
