package com.thread;

import java.util.ArrayList;
import java.util.List;

public class Goods {
	private static List<Integer> list = new ArrayList<Integer>();
	private static Object lock = new Object();
	
	public Object getLock() {
		return lock;
	}
	
	public void add(Integer a) {
		System.out.println("����  " + a);
		list.add(a);
	}
	
	public void remove() {
		Integer a = list.remove(0);
		System.out.println("����  " + a);
	}
	
	public int size() {
		return list.size();
	}
}
