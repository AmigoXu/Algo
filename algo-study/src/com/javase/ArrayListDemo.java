package com.javase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListDemo {
	
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for (Iterator i = list.iterator(); i.hasNext();) {
			String string = (String) i.next();
			System.out.println(string);
			i.remove();
		}
		Character c = '是';
		System.out.println(c.hashCode());
	}
	
	/**
	 * 找字符串第一个不重复, 返回index,找不到-1
	 * ascii 0-127, 建一个128 int[], 第一次遍历string,每个ascii码值对应存出现次数
	 * 第二次遍历string, 第一次nums[i] == 1 return下标
	 * @param string
	 * @return
	 */
	int findFirstUniqueChar(String string) {
		char[] chars = string.toCharArray();
		int[] nums = new int[128];
		
		for (char c : chars) {
			int i = (int) c;
			nums[i] = ++nums[i];
		}
		
		for (int j = 0; j < chars.length; j++) {
			int i = (int) chars[j];
			if (nums[i] == 1) {
				//System.out.println(chars[j]);
				return j;
			}
		}
		return -1;
	}
	
}
