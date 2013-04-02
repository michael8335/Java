package com.yf.designpattern.proxy.dynamicproxy;

public class GunDog implements Dog {

	@Override
	public void info() {
		System.out.println("This is gun dog!!!");

	}

	@Override
	public void run() {
		System.out.println("The gun dog is running!!!");

	}

}
