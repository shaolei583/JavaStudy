package com.gsww.java.enumeration;

public class ColorTest {
	public static void main(String[] args) {
		Color color = Color.Red;
		System.out.println(color);
		System.out.println("***********");
		for (Color c : Color.values()) {
			System.out.println(c.ordinal()+","+c);
		}
		swithColor(color);
	}

	public static void swithColor(Color color) {
		switch (color) {
		case Red:
			System.out.println("ºìÉ«");
			break;
		case White:
			System.out.println("°×É«");
			break;
		case Black:
			System.out.println("ºÚÉ«");
			break;
		}
	}
}
