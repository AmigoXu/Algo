/*
 * 判等器接口
 */

package com.ds.dsaj;

public interface EqualityTester {
	public boolean isEqualTo(Object a, Object b);//若a与b相等，则返回true；否则，返回false
}