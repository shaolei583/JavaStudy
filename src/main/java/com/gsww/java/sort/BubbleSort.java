package com.gsww.java.sort;

import java.util.Iterator;

/**
 * ð������:һ��أ���n��Ԫ�ؽ���ð�������ܹ���Ҫ����n-1�ˡ�
 * ��1����Ҫ�Ƚ�n-1�Σ���2����Ҫ�Ƚ�n-2�Σ�......��i����Ҫ�Ƚ�n-i�Ρ�
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
			 System.out.print("��" + (i + 1) + "����������"); 
			 for (int b : a) {
				System.out.print(b+" ");
			}
			 System.out.println();
		}
	}
}
