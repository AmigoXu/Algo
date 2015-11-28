package com.algostudy;

class Jia {
	public synchronized void say(Yi yi) {
		System.out.println("甲对乙说：你给我一根笔我给你书");
		yi.give();
	}

	public synchronized void give() {
		System.out.println("甲给乙书了。");
	}
}

class Yi {
	public synchronized void say(Jia jia) {
		System.out.println("乙对甲说：你给我书，我给你笔。");
		jia.give();
	}

	public synchronized void give() {
		System.out.println("乙给甲笔了。");
	}
}

public class DeadLock implements Runnable {
	private Jia j = new Jia();
	private Yi y = new Yi();

	public DeadLock() {
		new Thread(this).start();
		j.say(y);
	}

	public void run() {
		y.say(j);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
	}

	public static void main(String args[]) {
		new DeadLock();
	}
}
