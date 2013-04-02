package com.yf.object;

public class StaticFactoryMethod {
	private StaticFactoryMethod() {
	}

	private static class SingletonHelper {
		private static StaticFactoryMethod instance = new StaticFactoryMethod();
	}

	public static StaticFactoryMethod getInstance() {
		return SingletonHelper.instance;
	}

	public void print() {
		System.out.println("This is factory method!");
	}

	public static void main(String args[]) {
		StaticFactoryMethod.getInstance().print();
	}
}
