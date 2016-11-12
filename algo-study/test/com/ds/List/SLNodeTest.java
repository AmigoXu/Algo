package com.ds.List;


public class SLNodeTest {

	public static void main(String[] args) throws Exception {
		SList list = new SList();
		list.insert(0, "A");
		list.insert(1, "B");
		list.insert(2, "C");
		list.insert(3, "D");
		list.print();
		
		list.reverse();
		list.print();
	}
}
