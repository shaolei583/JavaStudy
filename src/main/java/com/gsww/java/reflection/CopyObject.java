package com.gsww.java.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CopyObject {
	public Object copy(Object object) throws Exception {
		Class<?> classType = object.getClass();		
		Constructor<?> constructor = classType.getConstructor(new Class[]{});
		Object objectCopy = constructor.newInstance(new Object[]{});
		//如果构造函数无参，可以使用上面两行代码或者使用Object obj2 = classType.newInstance();
		//如果调用有参的构造方法只能使用上面的两行代码。传入相应的参数即可
		Field[] fields = classType.getDeclaredFields();
		for(Field field:fields){
			String firstLetter = field.getName().substring(0,1).toUpperCase();
			String getMethodName = "get"+firstLetter+field.getName().substring(1);
			String setMethodName = "set"+firstLetter+field.getName().substring(1);
			Method getMethod = classType.getMethod(getMethodName,new Class[]{});
			Method setMethod = classType.getMethod(setMethodName,new Class[]{field.getType()});
			Object value = getMethod.invoke(object,new Object[]{});
			setMethod.invoke(objectCopy,new Object[]{value});
		}
		return objectCopy;
	}
	public static void main(String[] args) throws Exception {
		Custom custom = new Custom("邵磊",34);
		custom.setId(1L);
		Custom c = (Custom)new CopyObject().copy(custom);
		System.out.println(c.getId()+","+c.getName()+","+c.getAge());
	}
}

class Custom {
	private Long id;
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Custom(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Custom() {
	}

}