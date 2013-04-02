package com.yf.multithreads;

public class Thread3 implements Runnable {

	int sum = 0;

	@Override
	public void run() {
		getSum();
	}

	public void getSum() {
		for(int i=1;i<=50;i++){
			//sum += 1;
			System.out.println(sum += 1); 
		}
	}
	public static void main(String args[]){
		Thread3 test=new Thread3();
		Thread t1=new Thread(test);
		Thread t2=new Thread(test);
		while(true){
			t1.start();
			t2.start();
		}
	}
}
