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
			if (method.isAnnotationPresent(Test.class)) {// 1.��testע��
				int n = method.getModifiers();
				if (n == Modifier.PUBLIC) {// 2.�������η�Ϊpublic
					if ("void".equals(method.getReturnType().getName())) {// 3.����ֵ����Ϊvoid
						Class<?>[] paramTypes = method.getParameterTypes();
						if (paramTypes.length == 0) {// 4.û�в���
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
