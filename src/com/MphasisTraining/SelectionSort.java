package com.MphasisTraining;

public class SelectionSort {
	public static void main(String[]args) {
		new SelectionSort().sort();
		
	}
	int [] arr = {12, 0, 555, 57, -65, 99, -10};
	private void sort() {
		for (int i = 0; i < arr.length; i++) {
			for(int j = i + 1 ; j< arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					
			}
			
			}
		}
		System.out.println("After Sorting");
		for(int i= 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	

	

}
