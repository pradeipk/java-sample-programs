package com.p2.collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExIteration {

	// various ways of iterationg over Map 
	//https://stackoverflow.com/questions/46898/how-to-efficiently-iterate-over-each-entry-in-a-map
	
	public static void main(String[] args) {

		Map<Integer, String> map0 = new HashMap<Integer, String>();
		map0.put(1, "Harsih");
		map0.put(2, "Suresh");
		map0.put(3, "Mahesh");
		map0.put(4, "Jignesh");

		// For Each with Entry Set
		for (Map.Entry<Integer, String> e : map0.entrySet()) {
			System.out.print(e.getKey() + ":");
			System.out.println(e.getValue());
		}

		// For Each with Key Set
		System.out.println("--------------------------------------------- 25");
		String i = "0";
		for (Integer key : map0.keySet()) {
			i += key + map0.get(key);
			System.out.println(i);
		}

		// Iterator
		System.out.println("--------------------------------------------- 32");
		Iterator<Map.Entry<Integer, String>> it = map0.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> pair = it.next();
			System.out.println(pair.getKey() + ":" + pair.getValue());
		}

		final String[] j = { "0" };
		StringBuffer b = new StringBuffer();
		System.out.println("--------------------------------------------- 42");
		map0.forEach((k, v) -> b.append(k + v));
		System.out.println(b);		
		
		/*long i = 0;
		MapIterator<Integer, Integer> it = iterableMap.mapIterator();
		while (it.hasNext()) {
		    i += it.next() + it.getValue();
		}*/
		
		// Without Generics
		Map map = new HashMap();
		Iterator entries = map.entrySet().iterator();
		while (entries.hasNext()) {
		    Map.Entry entry = (Map.Entry) entries.next();
		    Integer key = (Integer)entry.getKey();
		    Integer value = (Integer)entry.getValue();
		    System.out.println("Key = " + key + ", Value = " + value);
		}	
		
		//iterating over keys only
		for (Integer key : map0.keySet()) {
		    System.out.println("Key = " + key);
		}

		//iterating over values only
		for (String value : map0.values()) {
		    System.out.println("Value = " + value);
		}
				
	}
}
