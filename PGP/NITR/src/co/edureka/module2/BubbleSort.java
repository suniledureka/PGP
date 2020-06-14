package co.edureka.module2;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {64,25,12,22,11};
		System.out.println("Before Sorting = "+ Arrays.toString(arr));
		
		BubbleSort obj = new BubbleSort();
		obj.bubbleSort(arr);
		
		System.out.println("After Sorting = "+ Arrays.toString(arr));
	}
	
	void bubbleSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
