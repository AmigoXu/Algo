package com.algostudy;

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
	
	public static void main(String[] args) {
		System.out.println(calcN(1005));
	}
}
