package com.yf.designpattern.proxy;

public class Administrator implements Admin {

	@Override
	public void doSomething() {
		System.out.println("我的地盘，我做主.......");
	}

}
