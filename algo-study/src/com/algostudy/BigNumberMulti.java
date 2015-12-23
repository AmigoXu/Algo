package com.algostudy;

import java.math.BigInteger;
import java.util.Arrays;

import com.sun.java_cup.internal.runtime.lr_parser;


public class BigNumberMulti {
	public static int[] getBigNumberMulti(String s1, String s2) {
		char[] n, m;
		int ln, lm;
		if (s1.length() > s2.length()) {
			n = s1.toCharArray();
			ln = s1.length();
			m = s2.toCharArray();
			lm = s2.length();
		} else {
			n = s2.toCharArray();
			ln = s2.length();
			m = s1.toCharArray();
			lm = s1.length();
		}
		int lr = ln+lm;
		int[] r = new int[lr];
		//Arrays.fill(r, '0');
		

		for (int i = m.length-1; i>=0; i--) {
			for (int j = n.length-1; j>=0; j--) {
				int k = i+j+1;
				r[k] += ((n[j]-'0')*(m[i]-'0'))%10;
				r[k-1] += ((n[j]-'0')*(m[i]-'0'))/10;
			}
		}
		
		return r;
	}
	
	public static void main(String[] args) {
		int[] a = BigNumberMulti.getBigNumberMulti("91789743593", "9713721983");
		BigInteger m = new BigInteger("91789743593");
		BigInteger n = new BigInteger("9713721983");
		
		System.out.println(m.multiply(n));
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}

	}
}
