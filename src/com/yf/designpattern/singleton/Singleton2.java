package com.yf.designpattern.singleton;
/*
 * 懒汉式
 */
public class Singleton2 {

	private Singleton2() {
	}

	public static Singleton2 getInstance() {
		return new Singleton2();

	}
}
