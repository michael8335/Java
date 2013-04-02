package com.yf.designpattern.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class MyProxyFactory {
	public static Object getProxy(Object target) throws Exception {
		MyInvokationHander myHander = new MyInvokationHander();
		myHander.setTarget(target);
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), myHander);
	}
}
