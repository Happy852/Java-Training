package com.MphasisTraining;

public class ArrayPrac {
	public static void main(String[] args) {

		int a[] = { 11, 25, 53, 57, 36, 17, 88 };
		for (int i = 0; i < 6; i++) {
			System.out.println("Elements of array a: " + a[i]);
		}

		int[][] b = { { 10, 5, 9, 2,4,7,45 } };

		System.out.println("\nLength of row 1: " + b[0].length);
	}
}
