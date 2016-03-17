package com.gsww.java.sort;

import java.util.Iterator;

/**
 * 冒泡排序:一般地，对n个元素进行冒泡排序，总共需要进行n-1趟。
 * 第1趟需要比较n-1次，第2趟需要比较n-2次，......第i趟需要比较n-i次。
 * 
 * @author shaol
 * 
 */
public class BubbleSort {

	public static void sort(int[] a) {		
		for (int i = 0; i < a.length - 1; i++) {
			boolean flag = false;
			for (int j = 0; j < a.length - i - 1; j++) {				
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = true;
				}
				
			}
			 if(!flag){
				 return ;
			 }
			 System.out.print("第" + (i + 1) + "次排序结果："); 
			 for (int b : a) {
				System.out.print(b+" ");
			}
			 System.out.println();
		}
	}
}
