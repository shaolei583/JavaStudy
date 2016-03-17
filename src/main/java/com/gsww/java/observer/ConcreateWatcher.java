package com.gsww.java.observer;
/**
 * 具体的观察者角色
 * @author shaol
 *
 */
public class ConcreateWatcher implements Watcher {

	@Override
	public void upate(String str) {
		System.out.println(str);
	}

}
