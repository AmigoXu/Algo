package com.algostudy;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;  

import org.junit.Ignore;
import org.junit.Test;

import com.javase.HashSetDemo;

public class HashSetDemoTest {

	@Test
	public void testFindFirstUniqueChar() {
		String string = "amavvccbtbtkjll";
		String string2 = "aavvccbtbtll";
		
		int i = HashSetDemo.findFirstUniqueChar(string);
		assertThat(string.indexOf('m'), equalTo(i));
		
		i = HashSetDemo.findFirstUniqueChar(string2);
		assertThat(-1, equalTo(i));
	}

}
