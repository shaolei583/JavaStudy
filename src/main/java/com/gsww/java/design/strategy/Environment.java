package com.gsww.java.design.strategy;

import java.util.List;

public class Environment {
	private Sort sort;

	public void setSort(Sort sort) {
		this.sort = sort;
	}

	public void sort(List<Person> list) {
		this.sort.sort(list);
	}
}
