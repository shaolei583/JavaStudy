package com.gsww.java.generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * ����ʹ�÷������������ͱ����Ǽ̳�ĳ����,����ʵ��ĳ���ӿ�
 * û��ʹ��extends,Ĭ�� T extend Object
 * ֻ�ܽ���list�ṹ������ࡣ����ArrayList��LinkedList,������HashMap
 * @author shaol
 *
 * @param <T>
 */
public class GenericExtends<T extends List<String>> {

	public static void main(String[] args) {
		GenericExtends<ArrayList<String>>  arrayList = new GenericExtends<ArrayList<String>>();
		GenericExtends<LinkedList<String>> linkedList = new GenericExtends<LinkedList<String>>();
	}
}
