package com.javase;

public class SingleTon {
	/**
	 * �ڲ���
	 */
	
	private static class ClassHolder {
		private static final SingleTon INSTANCE = new SingleTon();
	}
	
	private SingleTon() {};
	
	public static SingleTon getInstance() {
		return ClassHolder.INSTANCE;
	}
	
}
