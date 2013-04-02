package com.yf.test;

import java.util.ArrayList;
import java.util.List;

public class Service {
	public static List doSomething() {
		List list=null;
		if(1==2){
			list= new ArrayList();
			/*
			 * 此处省略对list的其他操作
			 *  list=.....
			 */			
		}
		return list;
	}
}
