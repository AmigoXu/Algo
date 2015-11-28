package com.algostudy;

class Jia {
	public synchronized void say(Yi yi) {
		System.out.println("�׶���˵�������һ�����Ҹ�����");
		yi.give();
	}

	public synchronized void give() {
		System.out.println("�׸������ˡ�");
	}
}

class Yi {
	public synchronized void say(Jia jia) {
		System.out.println("�ҶԼ�˵��������飬�Ҹ���ʡ�");
		jia.give();
	}

	public synchronized void give() {
		System.out.println("�Ҹ��ױ��ˡ�");
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
