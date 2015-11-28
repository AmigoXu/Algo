package com.algostudy;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;  

import org.junit.Test;

public class OtherDemosTest {

	@Test
	public void testAddAdd() {
		assertThat(OtherDemos.addAdd2(), equalTo(171700));
	}
	
	@Test
	public void testaddFactorial() {
		assertThat(OtherDemos.addFactorial(2), equalTo(3L));
	}

	@Test
	public void testSort01() {
		String string = "0100100110";
		assertThat(OtherDemos.sort01(string), equalTo(2));
	}
	
	@Test
	public void test() {
		String string = "cbcacaabb";
		OtherDemos.rmAcopyB(string);
		String s2 = "72*189***789";
		int[] a = {6,7,8,9,1,2,3,4,5};
//		System.out.println(OtherDemos.moveStar(s2));
//		System.out.println(OtherDemos.ifSimilar("hello", "le"));
//		System.out.println(OtherDemos.leftRotateString("hello", 1));
//		System.out.println(OtherDemos.leftRotateString("hello", 3));
//		System.out.println(OtherDemos.leftRotateString("hello", 18));
//		System.out.println(OtherDemos.partialMinValue(a));
		String s3 = "2001111111";
		System.out.println(Integer.parseInt(s3));
		System.out.println(String.valueOf(4.56f));
	}
}
