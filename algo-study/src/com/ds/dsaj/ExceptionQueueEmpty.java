/*
 * 当试图对空队列应用front或dequeue方法时，本意外将被抛出
 */

package com.ds.dsaj;

public class ExceptionQueueEmpty extends RuntimeException {
	public ExceptionQueueEmpty(String err) {
		super(err);
	}
}
