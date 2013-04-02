package com.yf.ioc;

public class IcoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//调用者无需自己实例化类，有被调用者自身来管理
		IocServce.getInstance().doSomething();
	}
}
