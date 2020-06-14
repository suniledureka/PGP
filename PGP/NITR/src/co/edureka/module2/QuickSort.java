package co.edureka.module2;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = {64,25,12,22,11};
		System.out.println("Before Sorting = "+ Arrays.toString(arr));
		
		QuickSort obj = new QuickSort();
		obj.quickSort(arr,0,arr.length-1);
		
		System.out.println("After Sorting = "+ Arrays.toString(arr));
	}
	
	void quickSort(int[] arr,int left, int right)
	{
		if(left < right) {
			int position = partition(arr,left,right);
			quickSort(arr,left,position-1);
			quickSort(arr,position+1,right);
		}
	}
	
	static int partition(int[] arr, int left, int right)
	{
		int pivot = arr[right];
		int i=left-1;
		for(int j=left;j<right;j++) {
			if(arr[j]< pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}//if
		}//for
		//swap
		int tmp = arr[i+1];
		arr[i+1] = arr[right];
		arr[right] = tmp;
		return i+1;
	}
}
