package com.gsww.java.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<Student> students = new HashSet<Student>();
		Student s1 = new Student("zhangsan");
		Student s2 = new Student("zhangsan");
		students.add(s1);
		students.add(s2);
		System.out.println(students.size());
		System.out.println(students);
		for (Iterator<Student> iterator = students.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}

	}
}

class Student {
	private String name;

	public Student(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}