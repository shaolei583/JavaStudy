package com.gsww.java.generic;
/**
 * 两个泛型参数
 * @author shaol
 *
 * @param <T1>
 * @param <T2>
 */
public class Generic<T1,T2> {

	private T1 foo1;
	private T2 foo2;
	public T1 getFoo1() {
		return foo1;
	}
	public void setFoo1(T1 foo1) {
		this.foo1 = foo1;
	}
	public T2 getFoo2() {
		return foo2;
	}
	public void setFoo2(T2 foo2) {
		this.foo2 = foo2;
	}
	public static void main(String[] args) {
		Generic<String,Integer> generic = new Generic<String,Integer>();
		generic.setFoo1("shao");
		generic.setFoo2(2);
		System.out.println(generic.getFoo1()+","+generic.getFoo2());
		int a = 0;
		int b = a++;
		System.out.println("a="+a+",b="+b);
	}
}
