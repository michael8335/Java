package com.yf.algorithm;
/*
 * This is a implement of quickly sort
 * @author:Michael
 * @version:1.0
 * 
 */
public class QuickSort {
	public int division(int[] list, int left, int right) {
		int baseNum = list[left];
		while (left < right) {
			while (left < right && list[right] >= baseNum) {
				right--;
			}
			list[left] = list[right];
			while (left < right && list[left] <= baseNum) {
				left++;
			}
			list[right] = list[left];
		}
		list[left] = baseNum;
		return left;
	}

	public void sort(int[] list, int left, int right) {
		if (left < right) {
			int i = division(list, left, right);
			sort(list, left, i - 1);
			sort(list, i + 1, right);
		}
	}

	public static void main(String args[]) {
		int list[] = { 3, 2, 5, 6, 8, 1 };
		QuickSort q = new QuickSort();
		q.sort(list, 0, list.length - 1);
		System.out.println(list);
	}
}
