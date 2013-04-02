package com.yf.designpattern.proxy.dynamicproxy;

public class TxUtil {
	public void beginTx() {
		System.out.println("=======The transaction is begining========");
	}
	public void endTx(){
		System.out.println("=======The transaction is ending========");
	}
}
