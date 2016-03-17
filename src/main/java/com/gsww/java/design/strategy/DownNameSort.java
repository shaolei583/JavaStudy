package com.gsww.java.design.strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ∞¥’’–’√˚Ωµ–Ú≈≈¡–
 * 
 * @author shaol
 * 
 */
public class DownNameSort implements Sort, Comparator<Person> {

	@Override
	public void sort(List<Person> list) {
		Collections.sort(list,this);
	}

	@Override
	public int compare(Person o1, Person o2) {
		int result = o2.getName().compareTo(o1.getName());
		if (result == 0) {
			return o2.getId() - o1.getId();
		}
		return result;
	}

}
