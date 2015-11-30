package com.algostudy;

public class MathProblem {
	/**
	 * 计算n阶乘后0的个数(按照5的倍数计算)  
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
	
	public static void main(String[] args) {
		System.out.println(calcN(1005));
	}
}
