package com.yf.ioc;

public class IocServce {
	//单例模式，
	private IocServce(){	
	}
	//私有内部类，保证线程安全
	private static class IocHelper{
		private static IocServce ioc=new IocServce(); 
	}
	public static IocServce getInstance(){
		return IocHelper.ioc;
	}
	public void doSomething(){
		System.out.println("This is Ioc Test");
	}
}
