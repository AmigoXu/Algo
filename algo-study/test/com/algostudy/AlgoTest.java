package com.algostudy;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;  
import org.junit.Ignore;
import org.junit.Test;

public class AlgoTest {

	@Ignore
	@Test
	public void testBubbleSort() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public void testSelectionSort() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public void testMergeSort1() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public void testMerge1() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public void testQuickSort() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public void testPartition() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public void testCalcCount() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public void testReverseString() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public void testReverseStmt() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testIsEmail() {
		//assertTrue(Algo.isEmail("a@a.a")); // TODO
		assertFalse(Algo.isEmail("a@ .aa "));
		assertThat(Algo.isEmail("a@ .aa "), anything());
	}

}
