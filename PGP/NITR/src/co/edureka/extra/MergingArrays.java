package co.edureka.extra;

import java.util.Arrays;

public class MergingArrays {

	public static void main(String[] args) {
		int[] arr1 = {2,8,15,18};
		int[] arr2 = {5,9,12,17,24,30};		
		
		int[] arr3 = mergeArrays(arr1,arr2);
		
		System.out.println("First Array = "+ Arrays.toString(arr1));
		System.out.println("Second Array = "+ Arrays.toString(arr2));
		System.out.println("Merged Array = "+ Arrays.toString(arr3));
	}
	
	static int[] mergeArrays(int[] arr1, int[] arr2) 
	{
		int[] arr3 = new int[arr1.length + arr2.length];
		
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i] < arr2[j])
			{
				arr3[k] = arr1[i];
				i++;
				k++;
			}
			else 
			{
			   arr3[k++] = arr2[j++];	
			}
		}//while
		
		//to push balance elements of arr1 to arr3
		for(;i<arr1.length;i++,k++) {
			arr3[k] = arr1[i];
		}
		
		//to push balance elements of arr2 to arr3
		for(;j<arr2.length;j++,k++) {
			arr3[k] = arr2[j];
		}
		return arr3;
	}
}
