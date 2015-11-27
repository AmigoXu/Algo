package com.algostudy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.util.Helper;

public class OtherDemos {
	
	

	/**
	 * 编程求：1+（1+2）+（1+2+3）+. . .+（1+2+3+. . .+100）
	 * 1²+2²+3²+.....+n²=n(n+1)(2n+1)/6
	 * 
	 * 1+2+3+....+n=n(n+1)/2=n²/2 +n/2
	 * 
	 * 1+（1+2）+（1+2+3）+（1+2+3+4）+.......+（1+2+3+....+100）
	 * =(1²+2²+3²+.....+100²)/2+(1+2+3+.....+100)/2
	 * =100*101*201/12+(1+100)*100/4 =169175+2525 =171700
	 */
	static int addAdd() {
		int sum = 0;// 总和
		for (int i = 1; i <= 100; i++) {
			int tempSum = 0;// 临时和
			for (int j = 1; j <= i; j++) {
				tempSum += j;
			}
			sum += tempSum;
		}
		return sum;
	}

	static int addAdd2() {
		int sum = 0;// 总和
		int tempSum = 0;
		for (int i = 1; i <= 100; i++) {
			tempSum += i;
			sum += tempSum;
		}
		return sum;
	}

	/**
	 * 编程求：1！+2！+3！+4！+. . .+15！
	 * 
	 */
	static long addFactorial(int n) {
		long result = 0;
		int temp = 1;
		for (int i = 1; i <= n; i++) {
			temp *= i;
			result += temp;
		}
		return result;
	}
	
	/**
	 * 九九乘法表
	 */
	public void print99() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i*j+"\t");
			}
			System.out.println();
			OtherDemos oo = new OtherDemos();
		}
	}
	
	/**
	 * array <--> List
	 */
	
	public static void main(String[] args) {
		Helper helper = new Helper();
		String[] ss = {"xx","ab","aa","bc", "ac"};
		List<String> l = new ArrayList<String>();
		
		// 方法1
		for (int i = 0; i < ss.length; i++) {
			l.add(ss[i]);
		}
		
		//方法2
		List<String> ll = Arrays.asList(ss);
		System.out.println(l.toString());
		
		/**
		 * 遍历list, 1. iterator, 2. foreach, 3.list.get(下标) 4. API要转型
		 */
		
		// iterator
		System.out.println(ll.get(1));
		String[] sout = new String[ll.size()];
		int k = 0;
		Iterator<String> i = ll.iterator();
		while (i.hasNext()) {
			String s = i.next();
			sout[k++] = s;
		}
		helper.printArray(sout);
		
		// foreach
		String[] sout2 = new String[ll.size()];
		k = 0;
		for (String string : ll) {
			sout2[k++] = string;
		}
		helper.printArray(sout2);
		
		//3.list.get(下标)
		String[] sout3 = new String[ll.size()];
		k = 0;
		for (int j = 0; j < ll.size(); j++) {
			sout3[k++] = ll.get(j);
		}
		helper.printArray(sout3);
		
		//API
		String[] sout4 = (String[]) ll.toArray();
		helper.printArray(sout4);
		
	}

	
	
		static {
			System.out.println("---------static----------");
		}
		
		{
			System.out.println("---------{   }----------");
		}
	
}
