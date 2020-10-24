package co.edureka.extra;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {64,25,12,22,11};
		System.out.println("Original Array = "+ Arrays.toString(arr));
		
		sort(arr);
		
		System.out.println("Sorted Array = "+ Arrays.toString(arr));
	}

	static void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++)
		{
			int min = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
					min = j;
			}//inner for
			if(min != i)
			{
				//swap the elements
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}//outer for
	}
}
