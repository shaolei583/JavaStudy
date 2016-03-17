package com.gsww.java.enumeration;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetTest {

	public static void main(String[] args) {
		EnumSet<Color> enumSet = EnumSet.of(Color.Red,Color.Black);
		//EnumSet.noneOf(Color.class)//只能接收Color类型的
		showEnumSet(enumSet);
	}
	
	public static void showEnumSet(EnumSet<Color> enumSet){
		for(Iterator<Color> iterator = enumSet.iterator();iterator.hasNext();){
			System.out.println(iterator.next());
		}
	}
}
