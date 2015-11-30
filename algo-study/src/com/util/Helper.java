package com.util;

import java.util.Iterator;
import java.util.Map;

public class Helper {
	public void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	private void swap(String[] arr, int i, int j) {
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
	
	public void printArray(int[] arr) {
		System.out.print("[");
		for (int x = 0; x < arr.length; x++) {
			if (x != arr.length - 1)
				System.out.print(arr[x] + ", ");
			else
				System.out.println(arr[x] + "]");
		}
	}
	
	public void printArray(String[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1)
				System.out.print(arr[i] + ", ");
			else
				System.out.println(arr[i] + "]");
		}
	}
	
	public void printArray(char[] arr) {
		System.out.print("[");
		for (int x = 0; x < arr.length; x++) {
			if (x != arr.length - 1)
				System.out.print(arr[x] + ", ");
			else
				System.out.println(arr[x] + "]");
		}
	}
	
	public <K,V> void print(Map<K, V> map) {
		Iterator<Map.Entry<K, V>> i = map.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry<K, V> entry = i.next();
			System.out.println(entry.getKey()+ "\t" + entry.getValue());
		}
	}
	
	public void print(String string) {
		System.out.println(string);
	}
	
}
