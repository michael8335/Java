package com.yf.designpattern.proxy;

public class Driver implements Car{
	private Car car;
	public Driver(Car car){
		this.car=car;
	}
	public void drive(){
		if(car==null){
			 car=new BmwCar();
		}
		car.drive();
	}
}
