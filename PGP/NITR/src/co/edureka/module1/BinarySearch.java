//Binary search is possible only on a sorted array

package co.edureka.module1;

public class BinarySearch {	
	public static void main(String[] args) {
		int[] arr = {3,6,8,12,14,17,25,29,31,36,42,47,53,55,62};
		System.out.println("No of Elements in Array = "+ arr.length);
		
		int searchElement = 12;
		int index = binarySearch(arr,0,arr.length-1,searchElement);
		
		if(index == -1)
			System.out.println(searchElement+" is not present in array");
		else
			System.out.println(searchElement+ " is in index "+ index);
	}
	
	static int binarySearch(int[] arr, int beg, int end, int key)
	{		
		while(beg<=end)
		{
			int mid= (beg+end)/2;
			if(arr[mid] == key)
				return mid;
			else if(arr[mid] < key)
				beg = mid+1;
			else
				end = mid-1;
			
			//return binarySearch(arr,beg,end,key);
		}
		return -1;
	}
}
