/*
 * Comparable对象的默认比较器
 */

package com.ds.dsaj;

public class ComparatorDefault implements Comparator {
	public ComparatorDefault() {}
	public int compare(Object a, Object b) throws ClassCastException {
		return ((Comparable) a).compareTo(b);
	}
}