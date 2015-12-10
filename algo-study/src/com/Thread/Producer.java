/**
 * 
 */
package com.Thread;


/**
 * @author 801
 *
 */
public class Producer extends Thread {
	
	@Override
	public void run() {
		Goods goods = new Goods();
		Object lock = goods.getLock();
		int i = 0;
		while (i <= 100) {
			synchronized (lock) {
				if (goods.size() < 10) {
					goods.add(i++);
					lock.notifyAll();
				} else {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				//模拟生产消耗时间
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			
		}
		System.err.println(Thread.currentThread().getName()+"producer over...");
	}
	
}
