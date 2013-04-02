package com.yf.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sort {
	public static void main(String args[]) {
		/*
		 * 先创建一个数组
		 */
		Integer original[] = createArray(5);
		/*
		 * 打印原始数组元素
		 */
		printArray(original);
		/*
		 * 进行数组排序
		 */
		Integer[] result = selectSort(original);
		/*
		 * 输出排序后的记过
		 */
		printArray(result);
	}

	/*
	 * 进行插入排序，将输入数组按照从小到大排序
	 */
	public static Integer[] insertSort(Integer[] original) {
		long start = System.currentTimeMillis();
		int i, j, k, temp;
		for (j = 0; j < original.length; j++) {
			temp = original[j];
			i = j - 1;
			while (temp < original[i]) {

			}
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		return original;
	}

	public static Integer[] selectSort(Integer[] original) {
		int i, j, m;
		for (i = 0; i < original.length; i++) {
			m = i;
			for (j = i + 1; j < original.length; j++) {
				if (original[j] < original[m]) {
					m = j;
					if (i != m) {
						int temp = 0;
						temp = original[m];
						original[m] = original[i];
						original[i] = temp; // swap(original[m],original[i]); }
					}
				}
			}

			/*
			 * for (int i = 0; i < original.length-1; i++) {
			 * 
			 * for (int j = i + 1; j < original.length; j++) { if (original[i] >
			 * original[j]) { int temp = original[i]; original[i] = original[j];
			 * original[j] = temp; } }
			 * 
			 * }
			 */
		}
		return original;

	}

	public static void swap(int a, int b) {
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
	}

	/*
	 * 产生数组方法，输入数组长度，随即返回一个数组
	 */
	public static Integer[] createArray(int size) {
		List<Integer> list = new ArrayList<Integer>();
		Integer j = 0;
		while (j < size) {
			Random rand = new Random();
			int temp = rand.nextInt(1000);
			list.add(temp);
			j = list.size();
		}
		return (Integer[]) list.toArray(new Integer[list.size()]);
	}

	/*
	 * 输出数组中的所有元素
	 */
	public static void printArray(Integer[] array) {
		for (int out : array) {
			System.out.print(out);
			System.out.print(",");
		}
		System.out.print("\n");
	}
}
