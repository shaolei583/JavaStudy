package com.gsww.java.observer;
/**
 * ����Ĺ۲��߽�ɫ
 * @author shaol
 *
 */
public class ConcreateWatcher implements Watcher {

	@Override
	public void upate(String str) {
		System.out.println(str);
	}

}
