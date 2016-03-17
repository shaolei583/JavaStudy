package com.gsww.java.enumeration;

public class ShowEnum {

	public static void main(String[] args) {
		show(Color.valueOf(args[0]));
	}

	public static void show(Color color) {
		System.out.println(color);
		for (Color c : Color.values()) {
			System.out.println(c.compareTo(color));
		}
	}

}
