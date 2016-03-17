package com.gsww.java.design.strategy;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		Person p1 = new Person(1,"tom",23);
		Person p2 = new Person(2,"jack",21);
		Person p3 = new Person(3,"jack",10);
		Person p4 = new Person(4,"tom",56);
		
		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		Environment environment = new Environment();
		UpByNameSort upByNameSort = new UpByNameSort();
		environment.setSort(upByNameSort);
		environment.sort(list);
		for (Person person : list) {
			System.out.println(person);
		}
		System.out.println("-------------------");
		DownNameSort downNameSort = new DownNameSort();
		environment.setSort(downNameSort);
		environment.sort(list);
		for (Person person : list) {
			System.out.println(person);
		}
	}
}
