package com.yf.designpattern.command;

public class TestCommand {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProcessArray pa = new ProcessArray();
		int[] target = { 3, 4, 5, 90, 43, 4, 2, 2 };
		int[] target2 = { 9, 7, 5, 10, 23, 4, 5, 2 };
		pa.each(target, new Command() {
			@Override
			public void process(int[] target) {
				for (int tmp : target) {
					System.out.println(tmp);
				}
			}
		});
		pa.each(target2, new Command() {
			@Override
			public void process(int[] target) {
				int sum = 0;
				for (int j = 0; j < target.length; j++) {
					sum += target[j];
				}
				System.out.println("the array sum is:" + sum);
			}
		});
	}

}
