/*
 * 当试图对没有后继的迭代器元素应用getNext()方法时，本意外将被抛出
 */

package com.ds.dsaj;

public class ExceptionNoSuchElement extends RuntimeException {
	public ExceptionNoSuchElement(String err) {
		super(err);
	}
}
