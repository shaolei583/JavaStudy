package com.gsww.java.properties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {

	public static void main(String[] args) {
		Properties p = System.getProperties();
		Set<Object> key = p.keySet();
		for(Iterator<Object> iterator= key.iterator();iterator.hasNext();){
			String value = p.getProperty((String)iterator.next());
			System.out.println(iterator.next()+"="+value);
		}
	} 
}
