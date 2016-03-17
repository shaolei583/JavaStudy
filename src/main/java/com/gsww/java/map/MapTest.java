package com.gsww.java.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("a", "shaolei");
		map.put("b", "weicaixia");
		map.put("c", "shaoguoguo");
		// 显示所有的key
		Set<String> keySet = map.keySet();
		for (String str : keySet) {
			System.out.println(str);
		}
		System.out.println("------------");
		// 显示所有的值
		Collection<Object> values = map.values();
		for (Object object : values) {
			System.out.println(object);
		}
		System.out.println("------------");
		Set<Entry<String, Object>> entries = map.entrySet();
		for (Entry<String, Object> entry : entries) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		System.out.println("------------");
		for (String key : map.keySet()) {
			System.out.println(key + "=" + map.get(key));
		}

	}
}
