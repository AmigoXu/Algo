package com.ds.List;

public class SList {
	private SLNode head;
	private int size;
	
	public SList() {
		head = new SLNode();
		size = 0;
	}
	
	public SLNode getPreNode(int i) {
		if ((i < 0) || (i > size)) {
			return null;
		}
		SLNode p = head;
		for (; i > 0; i--)
			p = p.getNext();
		return p;
	}
	
	public SLNode getNode(int i) {
		if ((i < 0) || (i > size)) {
			return null;
		}
		SLNode p = head.getNext();
		for (; i > 0; i--)
			p = p.getNext();
		return p;
	}
	
	public void print() {
		SLNode p = head;
		while (true) {
			p = p.getNext();
			if (p == null) {
				break;
			}
			System.out.println(p);
		}		
	}
	
	public boolean insert(int i, Object obj) throws Exception {
		if ((i < 0) || (i > size)) {
			throw new Exception("out of boundary");
		}
		SLNode prev = getPreNode(i);
		SLNode q = new SLNode(obj, null);
		q.setNext(prev.getNext());
		prev.setNext(q);
		size++;
		return true;
	}
	
    public void reverse() {
		if (size == 1) {
			return;
		}
		
		SLNode prev = head;
		SLNode p = prev.getNext();
		SLNode q = p.getNext();
		
		while(true) {
			p.setNext( prev==head? null: prev );
			prev = p;
			p = q;
			q = q.getNext();
			if (q == null) {
				break;
			}
		}
		p.setNext(prev);
		head.setNext(p);
	}
}
