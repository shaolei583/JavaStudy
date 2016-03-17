package com.gsww.java.design.pattern;

/**
 * 单例模式（饿汉式单例类）
 * 
 * @author shaol 
 * 1、单例类只能有一个实例。 　*　
 * 2、单例类必须自己创建自己的唯一实例。 　
 * 3、单例类必须给所有其他对象提供这一实例。
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
 * 单利模式（懒汉式单例类:线程安全的）
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
