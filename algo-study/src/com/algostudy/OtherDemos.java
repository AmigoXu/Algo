package com.algostudy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.util.Helper;

public class OtherDemos {
	
	static Helper helper = new Helper();

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
		
		int x = 2;
		System.out.println(++x);
		
	}
	
	/**
	 * 一个0-1串, 进行排序,  问最少交换的次数
	 */
	static int sort01(String string) {
		int cnt = 0;
		if (string == null || string.length() <= 1) 
			return cnt;
		char[] chars = string.toCharArray();
		int i = 0, j = string.length()-1;
		while (i < j) {
		while (i < j && chars[i] == '0') {
			i++;
		}
		while (i < j && chars[j] == '1') {
			j--;
		}
		if (i < j) {
			//不做swap,直接计数, 但是要移动下标, 要不死循环
			cnt++;
			i++;
			j--;
		}
		}
		return cnt;
	}
	
	
	/**
	 * 删除所有的a,复制所有的b
	 */
	
	static String rmAcopyB(String string) {
		char[] temp = string.toCharArray();
		char[] chars = Arrays.copyOf(temp, temp.length*2);
		helper.printArray(chars);
		
		int cntb = 0;
		int j = 0;
		for (int i = 0; i < temp.length; i++) {
			if (chars[i] != 'a') {
			    if (chars[i] == 'b') cntb++;
				chars[j++] = chars[i];
			}
		}
		chars[j] = 0;
		Arrays.fill(chars, j, chars.length-1, (char)0);
		helper.printArray(chars);
		int len = j + cntb - 1;
		for (int i = j - 1; i >= 0; i--) {
			chars[len--] = chars[i];
			if (chars[i] == 'b') 
				chars[len--] = chars[i];
			
		}
		helper.printArray(chars);
		return String.copyValueOf(chars);
	}
	
	static String moveStar(String string) {
		char[] a = string.toCharArray();
		 int j = a.length - 1;
	     for (int i = j; i >= 0; i--) {
	          if (a[i] != '*')
	              a[j--] =  a[i];
	     }
	     Arrays.fill(a,0,j+1,'*');
	     return new String(a);
	}
	
	/**
	 * a,b 问b是否是a的变位词, a="hello" b="lel", "lo" //true  (elo false)
	 */
	static int ifSimilar(String a, String b) {
		char[] ca = a.toCharArray();
		char[] cb = b.toCharArray();
		int[] n = new int[26];
		int cnt = 0;
		int lenA = ca.length, lenB = cb.length;
		int ind = -1;
		for (int i = 0; i < lenB; i++) {
			int j = cb[i] - 'a'; 
			n[j] += 1;
			if (n[j] == 1) {
				cnt++;
			}
		}
		for (int i = 0; i < lenB; i++) {
			int j = ca[i] - 'a'; 
			n[j] -= 1;
			if (n[j] == 0) {
				cnt--;
			}
			if (n[j] == -1) {
				cnt++;
			}
		}
			
		if (cnt == 0) ind = 0;
		else {
			for (int i = lenB; i < lenA; i++) {
				int j = ca[i-lenB] - 'a'; 
				n[j] += 1;
				if (n[j] == 0) {
					cnt--;
				}
				if (n[j] == 1) {
					cnt++;
				}
				j = ca[i] - 'a';
				n[j] -= 1;
				if (n[j] == 0) {
					cnt--;
				}
				if (n[j] == -1) {
					cnt++;
				}
				
				if (cnt == 0) {
					ind = i - lenB + 1;
					break;
				}
			}
		}
		return ind;
	}
	
	
	static String leftRotateString(String string, int cnt) {
		int n = string.length();
		int m = cnt % n;
		StringBuffer sb1 = new StringBuffer(string.substring(0, m));
		StringBuffer sb2 = new StringBuffer(string.substring(m, n));
		sb1.reverse();
		sb2.reverse();
		sb1.append(sb2).reverse();
		return sb1.toString();
	}
	
	static int partialMinValue(int[] a) {
		if (a == null || a.length == 0)
			return -1;
		int n = a.length;
		if (n == 1 || a[0] < a[n - 1])
			return 0;
		if (a[n - 1] < a[n - 2])
			return n - 1;
		int i = 1, j = n - 2;
		int mid;
		while (true) {
			mid = (i + j) / 2;
			if (a[mid - 1] > a[mid]) {
				i = mid;
				break;
			} else {
				if (a[mid] > a[n - 2]) {
					i = mid;
				} else {
					j = mid;
				}
			}
		}
		return i;
	}
	
	
	
	
	
	

	
	
    static {
			System.out.println("---------static----------");
		}
		
		{
			System.out.println("---------{   }----------");
		}
	
}
