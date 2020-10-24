package co.edureka.extra;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) 
	{
		int[] arr = {1,5,7,8,13,19,20,23,29};
		Arrays.sort(arr);
		System.out.println("Elements = "+ Arrays.toString(arr));
		
		int key = 70;
		
		BinarySearch bSearch = new BinarySearch();
		int loc = bSearch.search(arr, 0, arr.length-1, key);
		
		if(loc != -1)
			System.out.println(key+" @ index "+loc);
		else
			System.out.println(key+" NOT in list");
	}
	
	int search(int[] arr, int beg, int end, int key)
	{
		while(beg <= end)
		{
			int mid = (beg+end)/2;
			if(arr[mid]==key)
				return mid;
			else if(key < arr[mid])
				end = mid-1;
			else
				beg = mid+1;
			
			return search(arr,beg,end,key);
		}//while
		return -1;
	}
}
