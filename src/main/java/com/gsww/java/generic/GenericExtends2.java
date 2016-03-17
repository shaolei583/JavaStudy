package com.gsww.java.generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * 
 * @author shaol
 *
 * @param <T>
 */
public class GenericExtends2<T> {

	public static void main(String[] args) {
		//list下面的继承层次
		GenericExtends2<? extends List> list = null;
		list = new GenericExtends2<ArrayList>();
		list = new GenericExtends2<LinkedList>();
		
		//list的上面的继承层次
		GenericExtends2<? super List> list1 = null;
		list1 = new GenericExtends2<Object>();
		//GenericExtends2<? extends Object>等价于GenericExtends2<?>，下面这种方式等价
		GenericExtends2<? extends Object> list2 = null;
		GenericExtends2<?> list3 = null;
		
	}
}
