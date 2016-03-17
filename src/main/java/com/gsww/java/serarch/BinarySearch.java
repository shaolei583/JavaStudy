package com.gsww.java.serarch;

/**
 * 二分法查找
 * 传入的数组必须是有序的
 * @author shaol
 * 
 */
public class BinarySearch {

	public static int search(int[] a, int key) {
		int low = 0;
		int heigh = a.length - 1;
		while (low <= heigh) {
			int middle = (low + heigh) / 2;
			if (a[middle] == key) {
				return middle;
			}
			if (a[middle] > key) {
				heigh = middle - 1;
			}
			if (a[middle] < key) {
				low = middle + 1;
			}
		}
		return -1;
	}
}
