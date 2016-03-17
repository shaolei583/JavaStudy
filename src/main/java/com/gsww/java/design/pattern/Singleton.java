package com.gsww.java.design.pattern;

/**
 * ����ģʽ������ʽ�����ࣩ
 * 
 * @author shaol 
 * 1��������ֻ����һ��ʵ���� ��*��
 * 2������������Լ������Լ���Ψһʵ���� ��
 * 3�������������������������ṩ��һʵ����
 * 
 */
/*
public class Singleton {

	private static Singleton singleton = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return singleton;
	}
}*/
/**
 * ����ģʽ������ʽ������:�̰߳�ȫ�ģ�
 * @author shaol
 *
 */
public class Singleton {

	private static Singleton singleton = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
