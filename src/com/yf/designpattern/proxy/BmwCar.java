package com.yf.designpattern.proxy;

public class BmwCar implements Car {
	static {
		System.out.println("现在处于待命状态");
	}
	public BmwCar(){
		try {
			System.out.println("汽车启动中.......");
			Thread.sleep(3000);
			System.out.println("汽车启动完毕.....");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void drive() {
		System.out.println("开始驾驶汽车.......");

	}

}
