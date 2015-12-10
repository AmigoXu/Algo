package com.Thread;

public class Run {

	public static void main(String[] args) {

		Producer p = new Producer();
		Consumer c = new Consumer();
		Consumer c2 = new Consumer();
		
		p.start();
		c.start();
		c2.start();
		
		while (true) {
			if (!p.isAlive()) {
				c.stopIt();
				c2.stopIt();
				break;
			}
		}
	}

}
