package co.edureka.module1;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {15,24,85,12,6,9,16};
		System.out.println(Arrays.toString(arr));
		
		sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	static void sort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++) 
		{
		  
		  int min = i;
		  for(int j=i+1;j<arr.length;j++) 
		  {
			  if(arr[j]<arr[min]) {
				  min = j;
			  }
		  }//inner for
		  if(min != i) {
			  int temp = arr[min];
			  arr[min] = arr[i];
			  arr[i] = temp;
		  }
		  System.out.println("Pass-"+(i+1)+":: "+Arrays.toString(arr));
		}//outer for
	}
}
