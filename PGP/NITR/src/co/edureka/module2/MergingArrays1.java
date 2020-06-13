package co.edureka.module2;

import java.util.Arrays;

public class MergingArrays1 {

	public static void main(String[] args) {
		String[] array_1 = {"Anil","Chandra","Emil"};
		String[] array_2 = {"Bijesh","Denil","Sujith","Sunil","Zenith"};
		
		String[] array_3 = new String[array_1.length+array_2.length];
		
		mergeArrays(array_1, array_2, array_3);
		
		System.out.println("Array-1 = "+ Arrays.toString(array_1));
		System.out.println("Array-2 = "+ Arrays.toString(array_2));
		System.out.println("Merged Array = "+ Arrays.toString(array_3));
	}
	
	static void mergeArrays(String[] arr_1, String[] arr_2, String[] arr_3) {
		int i=0,j=0,k=0;
		
		while(i<arr_1.length && j<arr_2.length)
		{
			if(arr_1[i].compareTo(arr_2[j])<0) {
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
