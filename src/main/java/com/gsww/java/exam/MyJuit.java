package com.gsww.java.exam;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MyJuit {

	public static void main(String[] args) {
		MyTest test = new MyTest();
		Class<MyTest> classType = MyTest.class;
		Method[] methods = classType.getDeclaredMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(Test.class)) {// 1.有test注解
				int n = method.getModifiers();
				if (n == Modifier.PUBLIC) {// 2.方法修饰符为public
					if ("void".equals(method.getReturnType().getName())) {// 3.返回值类型为void
						Class<?>[] paramTypes = method.getParameterTypes();
						if (paramTypes.length == 0) {// 4.没有参数
							try {
								method.invoke(test, new Object[] {});
							} catch (IllegalArgumentException e) {
								e.printStackTrace();
							} catch (IllegalAccessException e) {
								e.printStackTrace();
							} catch (InvocationTargetException e) {
								e.printStackTrace();
							}
						}
					}

				}

			}
		}

	}
}
