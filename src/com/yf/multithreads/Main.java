package com.yf.multithreads;

public class Main {

	/**
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		int n = 7;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(-n));
		System.out.println((n & -n));
	}

}
