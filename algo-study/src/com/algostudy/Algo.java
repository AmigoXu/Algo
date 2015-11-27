package com.algostudy;

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Algo {

	static int[] aux;

	public static void main(String[] args) {

		int a[] = { 9, 8, 7, 6, 5, 4, 3 };

		// bubbleSort(a);

		// selectionSort(a);

		// aux = new int[a.length];
		// mergeSort1(a, 0, a.length-1);

		quickSort(a, 0, a.length - 1);

		// int r = binarySearch(a, 0, 5, 8);
		// print(r);

		String string = "I am a student.";

		// int[] c = calcCount(string);
		// print(Arrays.toString(c));

		print(Arrays.toString(a));
		print(reverseStmt(string));
	}

	public static void bubbleSort(int[] nums) {
		if (nums == null || nums.length <= 1)
			return;
		int length = nums.length;
		int temp = 0;
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (nums[j] > nums[j + 1])
					swap(nums, j, j + 1);
			}
		}
	}

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			// 從尚未排序的數字當中，找到第i小的數值。
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[minIndex] > array[j])
					minIndex = j;
			}
			// 把第i小的數值，放在第i個位置。
			if (minIndex != i)
				swap(array, i, minIndex);
		}
	}

	static void mergeSort1(int[] a, int lo, int hi) {
		if (lo < hi) {
			int mid = (lo + hi) / 2;
			mergeSort1(a, lo, mid);
			mergeSort1(a, mid + 1, hi);
			merge1(a, lo, mid, hi);
		}

	}

	static void merge1(int[] a, int lo, int mid, int hi) {
		if (a[mid] <= a[mid + 1])
			return;

		int[] aux = new int[(hi - lo + 1)];

		int i = lo;
		int j = mid + 1;
		int k = 0;

		while (i <= mid && j <= hi) {
			if (a[i] < a[j]) {
				aux[k++] = a[i++];
			} else {
				aux[k++] = a[j++];
			}
		}

		while (i <= mid) {
			aux[k++] = a[i++];
		}

		while (j <= hi) {
			aux[k++] = a[j++];
		}

		for (int k1 = lo; k1 <= hi; k1++) {
			a[k1] = aux[k1 - lo];
		}
	}

	static void quickSort(int arr[], int left, int right) {
		if (left < right) {
			int p = partition(arr, left, right);
			quickSort(arr, left, p - 1);
			quickSort(arr, p + 1, right);
		}
	}

	static int partition(int arr[], int left, int right) {
		int pivot = arr[left];
		int i = left, j = right;

		while (i < j) {
			while (pivot <= arr[j] && i < j)
				j--;
			while (arr[i] <= pivot && i < j)
				i++;

			if (i < j) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}

		arr[left] = arr[i];
		arr[i] = pivot;

		return i;
	}

	private static int binarySearch(int[] a, int start, int end, int key) {
		int low = start;
		int high = end;
		while (low <= high) {
			int mid = (low + high) >>> 1;
			int midVal = a[mid];
			if (midVal > key) {
				high = mid - 1;
			} else if (midVal < key) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -(low + 1);
	}

	public static void swap(int arr[], int a, int b) {
		int temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void swap(char arr[], int a, int b) {
		char temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	/*
	 * 統計字母數量
	 */

	public static int[] calcCount(String string) {
		char[] ss = string.toCharArray();
		int[] result = new int[26];
		for (char c : ss) {
			if ('A' <= c && c <= 'Z')
				c = (char) (c + 'a' - 'A');
			if ('a' <= c && c <= 'z') {
				result[c - 'a']++;
			} else {
				continue;
			}
		}
		return result;
	}

	/*
	 * 反轉字串, 兩個枚舉，一個從頭到尾，一個從尾到頭，步調相同，逐步對調字元。雖然是兩個枚舉，卻只有一個迴圈。
	 */

	public static String reverseString(String string) {
		char[] c = string.toCharArray();
		for (int i = 0, j = c.length - 1; i < j; i++, j--) {
			swap(c, i, j);
		}
		return String.copyValueOf(c);
	}

	static String reverseStmt(String string) {
		String[] strs = string.split("\\s");
		for (int i = 0, j = strs.length - 1; i < j; i++, j--) {
			String string2 = strs[i];
			strs[i] = strs[j];
			strs[j] = string2;
		}
		String sr = "";
		for (String s : strs) {
			sr = sr + " " + s;
		}
		return sr;
	}

	public static boolean isEmail(String email) {
		if (email == null || email.length() < 5) {
			return false;
		}
		if (email.startsWith("@") || email.startsWith(".")
				|| email.endsWith("@") || email.endsWith(".")) {
			return false;
		}
		if (email.indexOf("@") > email.lastIndexOf(".")) {
			return false;
		}
		String[] ss = email.split("[@\\.]");
		//System.out.println(ss.length);
		for (String string : ss) {
			//System.out.println(string);
			if (string.trim().length() == 0) {
				return false;
			}
		}
		return true;
	}

	public static void print(String string) {
		System.out.println(string);
	}

}
