package com.gsww.java.generic;

/**
 * ·ºÐÍµÄ·ºÐÍ
 * 
 * @author shaol
 * 
 * @param <T>
 */
public class WarrpGeneric<T> {
	private GenerinInner<T> foo;

	public GenerinInner<T> getFoo() {
		return foo;
	}

	public void setFoo(GenerinInner<T> foo) {
		this.foo = foo;
	}

	public static void main(String[] args) {
		WarrpGeneric<Integer> warrpGeneric = new WarrpGeneric<Integer>();
		GenerinInner<Integer> generinInner = new GenerinInner<Integer>();
		generinInner.setT(11);
		warrpGeneric.setFoo(generinInner);
		GenerinInner<Integer> g = warrpGeneric.getFoo();
		Integer t = g.getT();
		System.out.println(t);
	}

}

class GenerinInner<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
