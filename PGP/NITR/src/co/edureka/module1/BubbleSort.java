package co.edureka.module1;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {15,24,85,12,6,9,16};
		System.out.println(Arrays.toString(arr));
		
		BubbleSort obj = new BubbleSort();
		obj.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	void sort(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
		 for(int j=0;j<arr.length-1;j++)
		 {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		 }
		}
	}
}
