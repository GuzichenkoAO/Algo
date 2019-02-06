package com.guzichenko;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] ints = {5, 7, 1, 3, 2, 0};
		sort(ints);
	}

	public static void sort(int[] ints) {
		for (int i = 0; i < ints.length; i++) {
			for (int j = 0; j < i; j++) {
				if (ints[i] < ints[j]) {
					int a = ints[i];
					ints[i] = ints[j];
					ints[j] = a;
				}
			}
		}
		System.out.println(Arrays.toString(ints));
	}

}
