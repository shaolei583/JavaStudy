package com.gsww.java.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getScore()-o2.getScore();
			}

		});
		Person p1 = new Person(10);
		Person p2 = new Person(20);
		treeSet.add(p1);
		treeSet.add(p2);
		for (Iterator<Person> iterator = treeSet.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
	}
}

class Person {
	private int score;

	public Person() {
	}

	public Person(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Person [score=" + score + "]";
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
