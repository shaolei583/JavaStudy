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
		//list����ļ̳в��
		GenericExtends2<? extends List> list = null;
		list = new GenericExtends2<ArrayList>();
		list = new GenericExtends2<LinkedList>();
		
		//list������ļ̳в��
		GenericExtends2<? super List> list1 = null;
		list1 = new GenericExtends2<Object>();
		//GenericExtends2<? extends Object>�ȼ���GenericExtends2<?>���������ַ�ʽ�ȼ�
		GenericExtends2<? extends Object> list2 = null;
		GenericExtends2<?> list3 = null;
		
	}
}
