package co.edureka.module2;

import java.util.Arrays;

public class MergingArrays {

	public static void main(String[] args) {
		/*
		int[] array_1 = {5,8,4,3,2};
		System.out.println(Arrays.toString(array_1));
		
		Arrays.sort(array_1);
		System.out.println(Arrays.toString(array_1));
		*/
		
		int[] array_1 = {2, 4, 6, 8};
		int[] array_2 = {1, 3, 5, 7, 9, 10, 11};
		
		int[] array_3 = new int[array_1.length+array_2.length];
		//System.out.println("Size of Array = "+ array_3.length);
		
		mergeArrays(array_1, array_2, array_3);
		
		System.out.println("Array-1 = "+ Arrays.toString(array_1));
		System.out.println("Array-2 = "+ Arrays.toString(array_2));
		System.out.println("Merged Array = "+ Arrays.toString(array_3));
	}
	
	static void mergeArrays(int[] arr_1, int[] arr_2, int[] arr_3) {
		int i=0,j=0,k=0;
		
		while(i<arr_1.length && j<arr_2.length)
		{
			if(arr_1[i]<arr_2[j]) {
				arr_3[k] = arr_1[i];
				i++;
				k++;
			}
			else {
				arr_3[k] = arr_2[j];
				j++;
				k++;
			}
		}
		
		/* to store the remaining elements of array-1 */
		for(;i<arr_1.length;i++,k++) {
			arr_3[k] = arr_1[i];
		}
		/* to store the remaining elements of array-2 */
		for(;j<arr_2.length;j++,k++) {
			arr_3[k] = arr_2[j];
		}				
	}
}
