package com.yf.interview;

public class ThreadTest2 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.out.println("The main thread is begin");
		Thread t = new SubThread1(1);
		t.start();
		t.join();
		System.out.println("The main thread is end");
	}

}

class SubThread1 extends Thread {
	private int i;

	public SubThread1(int i) {
		this.i = i;
	}

	public void run() {
		System.out.println("the subThread is begin ");
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("the subThread is end ");
	}
}
