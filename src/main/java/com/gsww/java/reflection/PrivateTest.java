package com.gsww.java.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
/**
 * Class类的getMethod和getDeclaredMethod的区别
 * 1.getDeclaredMethod和getMethod都是是类或接口声明的方法
 * 2.getMethod只是公共方法而getDeclaredMethod所有方法
 * 
 * 
 * method.setAccessible(true);//设置成为可以访问私有方法
 * field.setAccessible(true);
 * @author shaol
 * 调用私有方法和改变私有变量的值
 */
public class PrivateTest {

	public static void main(String[] args) throws Exception {
		Private p = new Private();
		Class<?> classType = p.getClass();
		Method method = classType.getDeclaredMethod("sayHello",new Class[]{String.class});
		method.setAccessible(true);//设置成为可以访问私有方法
		String str = (String)method.invoke(p,"邵磊");
		System.out.println(str);
		System.out.println("**********************");
		Field field = classType.getDeclaredField("name");
		field.setAccessible(true);//压制java对访问修饰符的检查
		field.set(p,"shaolei");
		String ss = p.getName();
		System.out.println(ss);
		
	 Type type = classType.getGenericSuperclass();
	 System.out.println(type);
		
	}
}
