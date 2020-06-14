package co.edureka.module2;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {64,25,12,22,11};
		System.out.println("Before Sorting = "+ Arrays.toString(arr));
		
		SelectionSort obj = new SelectionSort();
		obj.selectionSort(arr);
		
		System.out.println("After Sorting = "+ Arrays.toString(arr));
	}
	
	void selectionSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}					
			}
		}
	}
}
