/*
 * 默认判等器
 */

package com.ds.dsaj;

public class EqualityTesterDefault implements EqualityTester {
	public EqualityTesterDefault() {}
	public boolean isEqualTo(Object a, Object b)
	{	return (a.equals(b)); }//使用Java提供的判等器
}