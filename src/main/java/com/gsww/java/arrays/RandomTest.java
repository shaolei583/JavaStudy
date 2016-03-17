package com.gsww.java.arrays;

import java.util.Random;

/**
 * 生产【10-50】之间的随机数 两个生成随机数的方法1.int a = random.nextInt(41) + 10; 
 * 2.int b = (int) (Math.random() * 41 + 10);
 * 
 * @author shaol
 * 
 */
public class RandomTest {

	public static void main(String[] args) {
		// Random random = new Random();
		// for (int i = 0; i < 50; i++) {
		// int a = random.nextInt(41) + 10;
		// System.out.println(a);
		// int b = (int) (Math.random() * 41 + 10);
		// System.out.println(b);
		// }
		new RandomTest().random();
	}

	public void random() {
		int[] count = new int[41];
		Random random = new Random();

		for (int i = 0; i < 50; i++) {
			int number = random.nextInt(41) + 10;
			count[number - 10] = count[number - 10] + 1;
		}
		for (int i = 0; i < count.length; i++) {
			if (0 == count[i]) {
				continue;
			}
			System.out.println((i + 10) + "出现的次数为：" + count[i]);
		}

		int max = count[0];
		for (int i = 0; i < count.length; i++) {
			if (max < count[i]) {
				max = count[i];
			}
		}
		System.out.println(max);
		for(int i=0;i<count.length;i++){
			if(max==count[i]){
				System.out.print(i+10+" ");
			}
		}
	}
}
