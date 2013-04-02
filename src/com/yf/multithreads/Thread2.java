package com.yf.multithreads;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		out();
	}

	public synchronized void out() {
		try {
			//Thread.currentThread().wait();
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*notify();
		Thread.currentThread().start();*/
		System.out.println("This is Thead 2!!!");
	}

}
