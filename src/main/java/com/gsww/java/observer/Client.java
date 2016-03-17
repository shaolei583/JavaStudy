package com.gsww.java.observer;

public class Client {
	public static void main(String[] args) {
		Watched  girl = new ConcreateWatched();
		
		Watcher w1 = new ConcreateWatcher();
		Watcher w2 = new ConcreateWatcher();
		Watcher w3 = new ConcreateWatcher();
		
		girl.addWatcher(w1);
		girl.addWatcher(w2);
		girl.addWatcher(w3);
		
		girl.notifyWatchers("���Ǻð�");
		
		System.out.println("-------------------");
		
		girl.removeWatcher(w1);
		
		girl.notifyWatchers("ʣ����������");
	}
}
