package com.gsww.java.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CopyObject {
	public Object copy(Object object) throws Exception {
		Class<?> classType = object.getClass();		
		Constructor<?> constructor = classType.getConstructor(new Class[]{});
		Object objectCopy = constructor.newInstance(new Object[]{});
		//������캯���޲Σ�����ʹ���������д������ʹ��Object obj2 = classType.newInstance();
		//��������вεĹ��췽��ֻ��ʹ����������д��롣������Ӧ�Ĳ�������
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
		Custom custom = new Custom("����",34);
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