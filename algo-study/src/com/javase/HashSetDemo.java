package com.javase;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
	
	static class A {

		private int id;
		private String name;
		
		A(int id, String name) {
			this.id = id;
			this.name = name;
		}

		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

	}
	
	public static void main(String[] args) throws InterruptedException {
		A a1 = new A(1,"a");
		A a2 = new A(2,"b");
		A a3 = new A(3,"c");
		
		HashSet<A> set = new HashSet<A>();
		set.add(a1);
		set.add(a2);
		set.add(a3);
		
		//HashSet set2 = (HashSet) set.clone();
		//System.out.println(set2.size());
		
		Iterator i = set.iterator();
		while (i.hasNext()) {
			A a = (A) i.next();
			System.out.println(a.getId()+"\t"+a.getName());
			a.setName(a.getName()+"xxxxx");
			if(a.getId() == 2) {
				i.remove();
			//	Thread.sleep(5000);
				
			}
		}
		
		for (A a : set) {
			System.out.println(a.getId()+"\t"+a.getName());
		}
		
		Set<String> all = new TreeSet<String>();
		all.add("B");
		all.add("B");
		all.add("X");
		all.add("C");
		all.add("A");
		System.out.println(all);
		
	}
	

	/**
	 * 找字符串第一个不重复, 返回index,找不到-1
	 * 两个set, 一次遍历, 先add set1, 第一个set若contains,add set2
	 * 第二次遍历string, set2 没有则返回
	 * @param string
	 * @return
	 */
	public static int findFirstUniqueChar(String string) {
		if (string == null || string.length() == 0)
			return -1;
		if (string.length() == 1)
			return 0;
		char[] cs = string.toCharArray();
		HashSet set1 = new HashSet();
		HashSet set2 = new HashSet();
		for (int i = 0; i < cs.length; i++) {
			if (!set1.contains(cs[i])) {
				set1.add(cs[i]);
			} else {
				set2.add(cs[i]);
			}
		}
		for (int i = 0; i < cs.length; i++) {
			if (!set2.contains(cs[i])) {
				return i;
			}
		}
		return -1;
	}
}
