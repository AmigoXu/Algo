/*
 * 当作为参数的列表已空时，本意外将被抛出
 */

package com.ds.dsaj;

public class ExceptionListEmpty extends RuntimeException {
	public ExceptionListEmpty(String err) {
		super(err);
	}
}
