/*
 * 当试图对空的优先队列应用getMin()或delMin()方法时，本意外将被抛出
 */

package com.ds.dsaj;

public class ExceptionPQueueEmpty extends RuntimeException {
	public ExceptionPQueueEmpty(String err) {
		super(err);
	}
}
