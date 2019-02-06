package com.guzich;

import java.util.Arrays;

public class Selection {

	public static void main(String[] args) {
		int[] ints = {5, 7, 1, 3, 2, 0};
		sort(ints);
	}

	public static void sort(int[] ints) {
		for (int i = 0; i < ints.length; i++) {
			for (int j = 0; j < ints.length; j++) {
				if (ints[i] > ints[j]) {
					int a = ints[j];
					ints[j] = ints[i];
					ints[i] = a;
				}
			}
		}

		System.out.println(Arrays.toString(ints));

	}

}
