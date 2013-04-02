package com.yf.test;

class Value{
	int i;
}
public class Test004 {

	public static void main(String[] args) {
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		Value v1=new Value();
		Value v2=new Value();	
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		System.out.println(v1.equals(v2));
	}

}
