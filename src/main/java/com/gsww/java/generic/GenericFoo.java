package com.gsww.java.generic;

public class GenericFoo<T> {

	private T foo;

	public T getFoo() {
		return foo;
	}

	public void setFoo(T foo) {
		this.foo = foo;
	}
	public static void main(String[] args) {
		GenericFoo<String> str = new GenericFoo<String>() ;
		str.setFoo("shaolei");
		String name	= str.getFoo();
		System.out.println(name);
	}
}
