package com.gsww.java.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
/**
 * Class���getMethod��getDeclaredMethod������
 * 1.getDeclaredMethod��getMethod���������ӿ������ķ���
 * 2.getMethodֻ�ǹ���������getDeclaredMethod���з���
 * 
 * 
 * method.setAccessible(true);//���ó�Ϊ���Է���˽�з���
 * field.setAccessible(true);
 * @author shaol
 * ����˽�з����͸ı�˽�б�����ֵ
 */
public class PrivateTest {

	public static void main(String[] args) throws Exception {
		Private p = new Private();
		Class<?> classType = p.getClass();
		Method method = classType.getDeclaredMethod("sayHello",new Class[]{String.class});
		method.setAccessible(true);//���ó�Ϊ���Է���˽�з���
		String str = (String)method.invoke(p,"����");
		System.out.println(str);
		System.out.println("**********************");
		Field field = classType.getDeclaredField("name");
		field.setAccessible(true);//ѹ��java�Է������η��ļ��
		field.set(p,"shaolei");
		String ss = p.getName();
		System.out.println(ss);
		
	 Type type = classType.getGenericSuperclass();
	 System.out.println(type);
		
	}
}
