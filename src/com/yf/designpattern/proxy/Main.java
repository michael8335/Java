package com.yf.designpattern.proxy;

public class Main {
	
	public static void main(String args[]){
		AdminProxy ap=new AdminProxy(null);
		for(int i=0;i<5;i++){
			System.out.print("管理员第"+i+"次操作,");
			ap.doSomething();
		}
		
	}
	
}
