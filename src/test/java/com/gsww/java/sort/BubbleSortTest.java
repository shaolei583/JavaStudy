package com.gsww.java.sort;

import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void test(){
		int[] a = {1,2,4,5,3};
		BubbleSort.sort(a);
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
	@Test
	public void testCompareTo(){
		System.out.println("aac".compareTo("aab"));
	}
}
