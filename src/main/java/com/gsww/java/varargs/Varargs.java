package com.gsww.java.varargs;

public class Varargs {

	public static int sum(int... nums) {
		int sum = 0;

		for (int a : nums) {
			sum = sum + a;
		}
		return sum;
	}

	public static int sum1(String s, int... nums) {
		int sum = 0;

		for (int a : nums) {
			sum = sum + a;
		}
		return sum;
	}

	public static void main(String[] args) {
		int result = sum(1, 2, 3);
		System.out.println(result);
		int result1 = sum(new int[] { 1, 2, 3, 4 });
		System.out.println(result1);

	}
}
