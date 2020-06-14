package co.edureka.module2;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = {15,5,87,46,93,51,42};
		int key = 460;
		
		int loc = search(arr, key);
		
		if(loc >= 0){
			System.out.println(key +" is present in index : "+ loc);
		}
		else {
			System.out.println(key+" is not in the collection");
		}
	}
	
	static int search(int[] arr, int key)
	{
	  for(int i=0;i<arr.length;i++) {
		  if(arr[i] == key)
			  return i;
	  }
	  return -1;
	}
}
