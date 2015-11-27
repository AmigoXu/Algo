package com.algostudy;

import java.util.ArrayList;
import java.util.List;


public class ArrayListDemo {
	
	
	public static void main(String[] args) {
		String string = "avvmscksca";
		char[] chars = string.toCharArray();
		int[] nums = new int[128];
		List arrayList = new ArrayList();
		
		for (char c : chars) {
			int i = (int) c;
			nums[i] = ++nums[i];
		}
		
		for (int j = 0; j < chars.length; j++) {
			int i = (int) chars[j];
			if (nums[i] == 1) {
				System.out.println(chars[j]);
				return;
			}
			
		}
		
		System.out.println("not found");
	}
	
	/**
	 * ���ַ�����һ�����ظ�, ����index,�Ҳ���-1
	 * ascii 0-127, ��һ��128 int[], ��һ�α���string,ÿ��ascii��ֵ��Ӧ����ִ���
	 * �ڶ��α���string, ��һ��nums[i] == 1 return�±�
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
