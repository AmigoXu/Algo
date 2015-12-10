package com.algostudy;

import sun.org.mozilla.javascript.internal.regexp.SubString;

import com.util.Helper;

public class MathProblem {
	/**
	 * ����n�׳˺�0�ĸ���(����5�ı�������)  
	 * @return
	 */
	public static long calcN(long n) {
		long sum = 0;
		while(n != 0) {
			sum += n/5;
			n = n/5;
		}
		return sum;
	}
	
	/**
	 * ��һ������, �������������, �ݹ�ʵ��
	 * @param n
	 */
	public static void f(int n, int[] a, int k) {
		if (n == 0) {
			return;
		}
		a[k] = n % 10;
		n = (n - a[k]) / 10;
		f(n, a, k+1);
	}
	
	public static void p(int[] a, int begin, int end) {
		if (begin == end) {
			Helper.printArray(a);
			return;
		} else {
			for (int i = begin; i <= end; i++) {
				if (isSwap(a, begin, i)) {
					Helper.swap(a, begin, i);
					p(a, begin + 1, end);
					Helper.swap(a, begin, i);
				} 
			}
		}
	}
	
	public static boolean isSwap(int[] a, int begin, int i) {
		if (begin == 3 && a[i] == 4) {
			return false;
		}
		if (begin >= 1 && Math.max(a[begin-1], a[i]) == 5 
				&& Math.min(a[begin-1], a[i]) == 3) {
			return false;
		}
		if (begin == a.length-2 && Math.max(a[begin], a[begin+1]) == 5 
				&& Math.min(a[begin], a[begin+1]) == 3) {
			return false;
		}
		return true;
	}
	
	/**
	 * �����ȫ����  4,3,2,2,1,5, Ҫ�����λ������4, (3,5������������)
	 * @param a
	 */
	public static void perm(int[] a) {
		if (a == null) {
			return;
		}
		p(a, 0, a.length-1);
	}
	
	/**
	 * ���������
	 * @param args
	 */
	public static void rotateArray(int[] a, int m) {
		if (m == 0 || a == null || a.length <= 1) {
			return;
		}
		int n = a.length;
		m = (m > n)?(m % n):m;
		reverse(a, 0, m-1);
		reverse(a, m, n-1);
		reverse(a, 0, n-1);
	}
	
	public static void reverse(int[] a, int lo, int hi) {
		for (int i = lo, j = hi; i < j; i++, j--) {
			Helper.swap(a, i, j);
		}
	}
	/**
	 * �����1��2��5����������ͬ������ϵĺ�Ϊ100����ϸ�����
	 * x+2y+5z=100
	 * ����x+2y=100-5z����z<=20 x<=100 y<=50
	 * ����(x+2y)<=100����(x+5z)��ż��
	 * �������Ϊ100���ڵ�ż��+95���ڵ�����+90���ڵ�ż��+...+5���ڵ�����+1��
	 */
	public static void combine125to100() {
		int x = 0, y = 0, z = 0;
		for (z = 0; z <= 20; z++) {
			for (x = (100-5*z); x > 0; x=x-2) {
				y = (100-5*z-x)/2;
				System.out.println("x:"+ x +" y:"+ y +" z:"+ z +" sum:" + (x+2*y+5*z));
			}
		}
		
	}
	
	public static void main(String[] args) {
//		System.out.println(calcN(1005));
		
//		int[] a = new int[10];
//		f(123456789, a, 0);
//		Helper.printArray(a);
		
//		int[] a = {4,3,5,2,1};
//		perm(a);
		
//		int[] a = {1,2,3,4,5,7,8,9};
//		rotateArray(a, 4);
//		Helper.printArray(a);
		
		combine125to100();
	}
}
