package com.gsww.java.generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * 限制使用泛型类别，这个类型必须是继承某个类,或者实现某个接口
 * 没有使用extends,默认 T extend Object
 * 只能接收list结构下面的类。比如ArrayList，LinkedList,不能用HashMap
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
