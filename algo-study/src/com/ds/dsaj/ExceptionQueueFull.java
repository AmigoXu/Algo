/*
 * 当试图对满队列应用enqueue方法时，本意外将被抛出
 */

package com.ds.dsaj;

public class ExceptionQueueFull extends RuntimeException {
	public ExceptionQueueFull(String err) {
		super(err);
	}
}
