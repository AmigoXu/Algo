package com.algostudy;

import com.util.Helper;

public class ThreeWayQuickSort {

	/**
	 * i,lt                         gt
	 * [_____________________________]
	 * 
	 * 
	 * lo     lt     i    gt        hi
	 * [_<V__|__=V__|_______|___>V___]
	 * 
	 * [lo, lt-1] < V  [lt, i-1] = V  [gt+1, hi] > V
	 * [i, gt] unknown  quitCond: (i > gt) break;
	 * 
	 * 
	 * end:
	 * lo          lt   gt          hi
	 * [____<V____|__=V___|____>V____]
	 * 
	 * sort(a, lo, lt-1);
	 * sort(a, gt+1, hi);
	 */
	public static void sort(Comparable[] a, int lo, int hi) {
		if (lo >= hi || a == null)
			return;
		int i = lo, lt = lo, gt = hi;
		Comparable v = a[lo];
		while (true) {
			int cmp = a[i].compareTo(v);
			if (cmp < 0)
				Helper.swap(a, i++, lt++);
			else if (cmp > 0)
				Helper.swap(a, i, gt--);
			else if (cmp == 0)
				i++;
			if (i > gt)
				break;
		}
		sort(a, lo, lt - 1);
		sort(a, gt + 1, hi);
	}

	public static void main(String[] args) {
		Comparable[] a = { 9, 8, 7, 8, 6, 8, 7, 7, 7, 3, 5, 7, 8 };
		sort(a, 0, a.length - 1);
		Helper.printArray(a);
	}

}
