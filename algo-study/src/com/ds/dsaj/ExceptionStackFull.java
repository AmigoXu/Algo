/*
 * 当试图对满栈应用push方法时，本意外将被抛出
 */

package com.ds.dsaj;

public class ExceptionStackFull extends RuntimeException {
	public ExceptionStackFull(String err) {
		super(err);
	}
}
