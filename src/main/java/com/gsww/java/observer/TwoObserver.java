package com.gsww.java.observer;

import java.util.Observable;
import java.util.Observer;

class BeingWatched extends Observable {
	public void count(int number) {
		for (; number >= 0; number--) {
			this.setChanged();
			this.notifyObservers(number);
		}
	}
}

class Watcher1 implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("wathch1=" + arg);
	}

}

class Watcher2 implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		if (((Integer) arg).intValue() <= 5) {
			System.out.println("Watcher2=" + arg);
		}
	}

}

public class TwoObserver {
	public static void main(String[] args) {
		BeingWatched watched = new BeingWatched();
		Observer o1 = new Watcher1();
		Observer o2 = new Watcher2();

		watched.addObserver(o1);
		watched.addObserver(o2);
		watched.count(10);

	}
}
