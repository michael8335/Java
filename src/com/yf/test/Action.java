package com.yf.test;

import java.util.List;

public class Action {
	public void excute(){
		List list=null;
		list=Service.doSomething();
		if(list!=null&&list.isEmpty()){
			/*
			 */
		}
	}
}
