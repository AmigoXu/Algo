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

}
