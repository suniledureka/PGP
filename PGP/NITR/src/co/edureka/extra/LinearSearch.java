package co.edureka.extra;

import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {12,25,6,7,89,15,20};
		System.out.println("Array Elements = "+ Arrays.toString(arr));
		
		int key = 120;
		
		int index = searchElement(arr,key);
		if(index == -1)
			System.out.println(key+" is NOT in list");
		else
			System.out.println(key+" is in index: "+ index);
	}
	
	static int searchElement(int[] arr, int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				return i;
			}
		}//for loop
		return -1;
	}
}
