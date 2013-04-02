package com.yf.multithreads;

public class FirstThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				int i = 0;
				while (i < 100) {
					System.out.println(Thread.currentThread().getName() + ":"
							+ i++);
				}
			}
		}).start();
		int i = 100;
		while (i > 0) {
			System.out.println(Thread.currentThread().getName() + ":" + i--);
		}
	}

}
