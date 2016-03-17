package com.gsww.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableTest {
	public static void main(String[] args) {
		Student s1 = new Student(1,"刘德华");
		Student s2 = new Student(3,"张学友");
		Student s3 = new Student(2,"郭富城");
		Student s4 = new Student(4,"黎明");
		List<Student> students =new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		Collections.sort(students);
		for(Iterator<Student> iterator = students.iterator();iterator.hasNext();){
			System.out.println(iterator.next().getName());
		}
	}
}

class Student implements Comparable<Student> {

	private int id;
	private String name;

	@Override
	public int compareTo(Student o) {
		return id - o.getId();
	}

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

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student() {
	}

}
