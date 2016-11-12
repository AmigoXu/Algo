package com.ds.List;

public class SLNode implements Node {
	
	private Object element;
	
	private SLNode next;
	
	public SLNode() {
		// TODO Auto-generated constructor stub
	}

	public SLNode(Object element, SLNode next) {
		this.element = element;
		this.next = next;
	}

	public SLNode getNext() {
		return next;
	}

	public void setNext(SLNode next) {
		this.next = next;
	}

	public Object getData() {
		// TODO Auto-generated method stub
		return element;
	}

	public void setData(Object obj) {
		// TODO Auto-generated method stub
		this.element = obj;
	}

	@Override
	public String toString() {
		return "SLNode [element=" + element + "]";
	}
	
}
