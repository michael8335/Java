package com.yf.designpattern.proxy;

public class Boss {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Long start=System.currentTimeMillis();
		Car car=new Driver(null);
		Long end=System.currentTimeMillis();
		System.out.println("开车......");
		car.drive();
	}

}
