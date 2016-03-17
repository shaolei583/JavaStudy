package com.gsww.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ComparatorTest {
	public static void main(String[] args) {
		Person p1 = new Person(1,"刘德华");
		Person p2 = new Person(3,"张学友");
		Person p3 = new Person(2,"郭富城");
		Person p4 = new Person(4,"黎明");
		List<Person> persons = new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		Collections.sort(persons,new MyComparator());
		for(Iterator<Person> iterator = persons.iterator();iterator.hasNext();){
			System.out.println(iterator.next().getName());
		}
 	}
}

class Person {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Person() {
		super();
	}
}

class MyComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getId() - o2.getId();
	}

}
