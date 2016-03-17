package com.gsww.java.generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GenericMap {

	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("wo",33);
		map.put("guo",3);
		map.put("xia",28);
		Set<String> keys = map.keySet();
		for(Iterator<String> iterator=keys.iterator();iterator.hasNext();){
			String key = iterator.next();
			Object object = map.get(key);
			System.out.println("key="+key+",value="+object);
		}
		System.out.println("8888888888888888888888888888");
		Set<Entry<String,Object>> set = map.entrySet();
		for(Iterator<Entry<String,Object>> iterator = set.iterator();iterator.hasNext();){
			Entry<String,Object> entry = iterator.next();
			System.out.println("key="+entry.getKey()+",value="+entry.getValue());
		}
		
	}
}
