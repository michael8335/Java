package com.yf.designpattern.factorymethod;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CarFactory cf=new BmwCarFactory();
		Car car=cf.driver();
		car.drive();

	}

}
