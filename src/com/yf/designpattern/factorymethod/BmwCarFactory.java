package com.yf.designpattern.factorymethod;

public class BmwCarFactory implements CarFactory {

	@Override
	public Car driver() {
		// TODO Auto-generated method stub
		return new BmwCar();
	}

}
