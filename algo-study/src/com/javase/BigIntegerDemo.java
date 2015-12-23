package com.javase;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerDemo {
	static BigInteger k = BigInteger.valueOf(1);
	static BigInteger j = BigInteger.valueOf(91);
	static BigInteger n;
	BigDecimal l=new BigDecimal("100");
	static BigInteger m = new BigInteger("100");
	public static void main(String[] args) {
		k=BigInteger.valueOf(1);
		k=new BigInteger("1");
		for(int i=1;i<=92;i++){ 
			k=k.multiply(j);
		}
		System.out.println(k.toString());
		n=k.remainder(m);
		n=k.remainder(m); 
		System.out.println(n.toString());
	}
	
}

