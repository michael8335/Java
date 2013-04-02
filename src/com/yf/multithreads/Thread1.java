package com.yf.multithreads;

public class Thread1 implements Runnable {

	@Override
	public void run() {
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("This is Thread 1!!!!");

	}

}
