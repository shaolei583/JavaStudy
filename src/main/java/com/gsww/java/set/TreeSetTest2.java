package com.gsww.java.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {
		TreeSet<Worker> treeSet = new TreeSet<Worker>();
		Worker p1 = new Worker(10);
		Worker p2 = new Worker(20);
		treeSet.add(p1);
		treeSet.add(p2);
		for (Iterator<Worker> iterator = treeSet.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
	}
}

class Worker implements Comparable<Worker> {
	private int score;

	public Worker() {
	}

	public Worker(int score) {
		this.score = score;
	}


	@Override
	public String toString() {
		return "Worker [score=" + score + "]";
	}

	@Override
	public int compareTo(Worker o) {
		return o.score-score;
	}

}
