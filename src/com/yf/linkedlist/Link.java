package com.yf.linkedlist;

public class Link {
	/*
	 * 下一个连接点的引用
	 */
	Link next;
	/*
	 * 需要保存的数据
	 */
	int iData;

	public Link(int iData) {
		this.iData = iData;
	}
	/*
	 * 用户打印每个连接点的值
	 */
	public void display(){
		System.out.print("["+iData+"]");
	}
}
