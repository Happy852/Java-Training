package com.MphasisTraining;
public class BubbleSort {

	public static void main(String[] args) {
		
	}
	int [] arr = {4, 2, 3, 65, 5, 6, 7, 8, 9, 10};
	public void sortArray()
	{
		int size = arr.length;
		for (int i= 1; i<size; i++) {
			for (int j=1 ; j<size; j++) {
				if (arr[j-1] > arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					
				}
				
			}
			System.out.println("End of Eteration");
			for(int j=1; j<size; j++) {
				System.out.println(arr[j] + " ");
			}
		}
		System.out.println("After sorting");
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
			
		}


}
