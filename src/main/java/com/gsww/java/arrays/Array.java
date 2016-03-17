package com.gsww.java.arrays;

/**
 * 数组的比较和拷贝
 */
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.equals(a, b));
		System.out.println("----------------");
		int[] c = { 1, 2, 3, 4, 5 };
		int[] d = new int[5];
		System.arraycopy(c, 0, d, 0, 5);
		for (int i : d) {
			System.out.print(i);
		}
		System.out.println("----------------");
		int[] e = Arrays.copyOf(c, 5);
		for (int i : e) {
			System.out.print(i);
		}
		long end = (System.currentTimeMillis())-start;
		System.out.println("ss="+end);
	}
}
