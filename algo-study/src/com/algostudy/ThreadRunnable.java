package com.algostudy;

class MyThread implements Runnable {
	private int count = 5;

	public void run() {
		for (int x = 0; x < 50; x++) {
			if (this.count > 0) {
				System.out.println("count = " + this.count--);
			}
		}
	}
}

public class ThreadRunnable {
	public static void main(String args[]) {
		MyThread mt = new MyThread();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
	}
}
