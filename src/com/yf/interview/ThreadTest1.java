package com.yf.interview;

public class ThreadTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// getThreadStates();
		Thread t = new SubThread(1);
		System.out.println(t.getState().ordinal());

		t.start();
		System.out.println(t.getState().ordinal());
		// t.run();
		System.out.println(t.getState().ordinal());
		// t.yield();
		System.out.println(t.getState().ordinal());
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!t.isAlive()){
			t.start();
		}
		System.out.println(t.isAlive());
		System.out.println(t.getState().ordinal());
		/*for(int i=0;i<10;i++){
			new SubThread(i).start();
		}*/
	}

	public static void getThreadStates() {
		System.out.println(Thread.State.NEW.ordinal());
		// output:0
		System.out.println(Thread.State.RUNNABLE.ordinal());
		// output:1
		System.out.println(Thread.State.BLOCKED.ordinal());
		// output:2
		System.out.println(Thread.State.WAITING.ordinal());
		// output:3
		System.out.println(Thread.State.TIMED_WAITING.ordinal());
		// output:4
		System.out.println(Thread.State.TERMINATED.ordinal());
		// output:5
	}

}

class SubThread extends Thread {
	private int i;

	public SubThread(int i) {
		this.i = i;
	}
	public void run() {
		System.out.println("The Thread Number is "+i+" and thw thread name is "+this.getName());
	}
}
