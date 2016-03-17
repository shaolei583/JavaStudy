package com.gsww.java.search;

import org.junit.Test;

import com.gsww.java.serarch.BinarySearch;

public class BinarySearchTest {

	@Test
	public void search(){
		int[] a = {1,2,3,4,5,6,7,8,9};
		int index = BinarySearch.search(a,9);
		System.out.println(index);
	}
}
