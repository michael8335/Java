package com.yf.designpattern.proxy.dynamicproxy;

public class Test {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("Before Proxy.......");
		Dog target=new GunDog();
		target.info();
		target.run();
		System.out.println("After Proxy.......");
		//get an instance of MyInvokationHander
		Dog dog=(Dog) MyProxyFactory.getProxy(target);
		//MyInvokationHander.invoke
		dog.info();
		//MyInvokationHander.invoke
		dog.run();
		System.out.println(dog.getClass().getName());
	}

}
