package com.algostudy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();
		m.put("a", "aa");
		m.put("b", "bb");
		m.put("c", "cc");
		
		Iterator<Map.Entry<String, String>> i = m.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry<String, String> entry = i.next();
			System.out.println(entry.getKey()+ "\t" + entry.getValue());
		}
	}
	
	
}
