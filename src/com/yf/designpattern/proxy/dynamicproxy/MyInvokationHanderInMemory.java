package com.yf.designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvokationHanderInMemory implements InvocationHandler {
	private Object target;

	public void setTarget(Object target) {
		this.target = target;
	}

	public void info() throws SecurityException, NoSuchMethodException,
			Throwable {
		this.invoke(target, this.target.getClass().getDeclaredMethod("info",
				null), null);
	}

	public void run() throws SecurityException, NoSuchMethodException,
			Throwable {
		this.invoke(target, this.target.getClass().getDeclaredMethod("run",
				null), null);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		TxUtil tu = new TxUtil();
		tu.beginTx();
		Object result = method.invoke(target, args);
		tu.endTx();
		return result;
	}

}
