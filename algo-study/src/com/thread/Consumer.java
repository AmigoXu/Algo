package com.thread;


public class Consumer extends Thread {
	
	boolean f = true;
	
	public void stopIt() {
		f = false;
	}
	
	@Override
	public void run() {
		Goods goods = new Goods();
		Object lock = goods.getLock();
 		
		synchronized (lock) {
			while (f) {
				if (goods.size() > 0) {
					System.out.print(Thread.currentThread().getName());
					goods.remove();
					lock.notifyAll();
				} else {
					try {
						lock.wait(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.err.println(Thread.currentThread().getName()+"consumer over...");
	}
}
