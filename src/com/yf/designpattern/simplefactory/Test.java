package com.yf.designpattern.simplefactory;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car=null;
		String str="Benz";
		CarFactory carFactory=new CarFactory();
		car=carFactory.driver(str);
		car.drive();
	}

}
