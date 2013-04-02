package com.yf.designpattern.simplefactory;

public class CarFactory {
	public Car driver(String str) {
		if(str.equalsIgnoreCase("Bmw")){
			return new BmwCar();
		}
		else if(str.equalsIgnoreCase("benz")){
			return new BenzCar();
		}
		else{
			return null;
		}
	}
}
