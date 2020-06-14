package co.edureka.module2;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		//int[] arr = {1,5,7,8,13,19,20,23,29};
		int[] arr = {2,4,6,8,10,12,14,16,18};
		Arrays.sort(arr);
		//System.out.println(arr); //toString()
		System.out.println(Arrays.toString(arr));
		
		int key = 10;
		
		int loc = binarySearch(arr, 0, arr.length-1, key);
		
		if(loc >= 0){
			System.out.println(key +" is present in index : "+ loc);
		}
		else {
			System.out.println(key+" is not in the collection");
		}		
	}
	
	static int binarySearch(int[] arr, int beg, int end, int key)
	{
		while(end >= beg)
		{
			int mid = (beg+end)/2;
			if(arr[mid]==key)
				return mid;
			else if(arr[mid]>key)
				end = mid-1;
			else
				beg = mid+1;
			binarySearch(arr,beg,end,key);
		}
		return -1;
	}
}
