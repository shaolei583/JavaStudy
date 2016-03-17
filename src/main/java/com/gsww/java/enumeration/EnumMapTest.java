package com.gsww.java.enumeration;

import java.util.EnumMap;

public class EnumMapTest {

	public static void main(String[] args) {
		EnumMap<Color,String> map = new EnumMap<Color,String>(Color.class);
		map.put(Color.Red,"ºìÉ«");
		map.put(Color.Black,"ºÚÉ«");
		map.put(Color.White,"°×É«");
		for(Color color:Color.values()){
			System.out.println(map.get(color));
		}
		
	}
}
