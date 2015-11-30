package com.javase;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.util.Helper;

public class MapDemo {
	private Map<String, String> map = new HashMap<String, String>();

	public static void main(String[] args) {

		Helper helper = new Helper();
		Map<String, String> m = new HashMap<String, String>();
		m.put("a", "aa");
		m.put("b", "bb");
		m.put("c", "cc");

		Iterator<Map.Entry<String, String>> i = m.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry<String, String> entry = i.next();
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}

		MapDemo m2 = new MapDemo();
		m2.setMap(m);
		helper.print(m2.map);
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	


}
