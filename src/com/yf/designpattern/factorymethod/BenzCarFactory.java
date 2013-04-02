package com.yf.designpattern.factorymethod;

public class BenzCarFactory implements CarFactory {
	
	@Override
	public Car driver() {
		// TODO Auto-generated method stub
		return new BenzCar();
	}

}
