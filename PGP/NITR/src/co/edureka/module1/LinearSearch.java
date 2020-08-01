package co.edureka.module1;

import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {10,20,5,45,89,71,26,4};
		System.out.println(Arrays.toString(arr));
		
		int searchElement = 40;
		int index = search(arr, searchElement);
		
		if(index == -1)
			System.out.println(searchElement+" is not present in array");
		else
			System.out.println(searchElement+ " is in index "+ index);
	}
	
	static int search(int[] arr, int key)
	{		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key) {
				return i;
			}
		}//for
		return -1;
	}
}
