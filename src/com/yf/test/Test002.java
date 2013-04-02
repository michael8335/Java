package com.yf.test;

public class Test002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*//查看操作系统相关参数
		System.getProperties().list(System.out);
		System.out.println("*****************");
		//查看当前用户名
		System.out.println(System.getProperty("user.name"));
		System.out.println("*****************");
		//查看java的环境变量
		System.out.println(System.getProperty("java.library.path"));*/
		Thread t=new Thread(new subThread());
		t.setDaemon(true);
		t.start();
		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
class subThread implements Runnable{

	@Override
	public void run() {
		boolean flag=true;
		while(flag){
			System.out.println("the thread is running......");
			try {
				Thread.sleep(5000);
				throw new InterruptedException();
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getId()+"InterruptedException happened...");
				System.out.println(Thread.currentThread().isAlive());
				/*if(Thread.currentThread().isAlive()){
					Thread t=new Thread(new subThread());
					t.setDaemon(true);
					t.start();
					Thread.currentThread().stop();
				}
				System.out.println(Thread.currentThread().isAlive());*/
			}
		}
		
	}
	
}
