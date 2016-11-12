/*
 * 迭代器ADT接口
 */

package com.ds.dsaj;

public interface Iterator {
	boolean	hasNext();//检查迭代器中是否还有剩余的元素
	Object	getNext();//返回迭代器中的下一元素
}