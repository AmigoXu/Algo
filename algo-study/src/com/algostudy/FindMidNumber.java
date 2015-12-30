package com.algostudy;

import com.util.Helper;

public class FindMidNumber {

	public static boolean isOdd(int n) {
		return (n & 1) != 0;
	}
	
	public static Comparable findMidNumber(Comparable[] a) {
		
		int n = a.length;
		int m = isOdd(n) ? (n+1)/2 : n/2;
		return select(a, m-1);
		
	}
	
	public static Comparable select(Comparable[] a, int n) {
		int lo = 0, hi = a.length-1;
		int i = lo;
		int j = lo;
		Comparable result = null;
		while (lo <= hi) {
			j = partition(a, lo, hi);
			if (j == n) {
				result = a[n];
				break;
			}
			else if (j < n) {
				lo = j + 1;
			} 
			else if (j > n) {
				hi = j - 1;
			}
		}
		return result;
	}
	
	public static int partition(Comparable[] a, int lo, int hi) {
		int i = lo, j = hi;
		Comparable pivot = a[lo];
		while(i < j) {
			while(pivot.compareTo(a[j]) < 0 && i < j)
				j--;
			while(pivot.compareTo(a[i]) > 0 && i < j)
				i++;
			if (i < j) {
				Helper.swap(a, i, j);
			}
		}
		Helper.swap(a, lo, i);
		return i;
	}
	
	public static void main(String[] args) {
		Comparable[] a = { 9, 8, 7, 8, 6, 8, 90, 1, 11, 3, 5, 2, 8 };
		System.out.println(findMidNumber(a));
		Comparable[] b = new Comparable[a.length];
		System.arraycopy(a, 0, b, 0, a.length);
		ThreeWayQuickSort.sort(b, 0, a.length-1);
		Helper.printArray(b);
	}

}
