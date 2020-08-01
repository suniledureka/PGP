package co.edureka.module1;

import java.util.Arrays;

public class MergingArrays {

	public static void main(String[] args) {
		int[] arr1 = { 2, 8, 10,15, 18 };
		System.out.println("Array-1 = " + Arrays.toString(arr1));

		int[] arr2 = { 5, 9, 12, 17, 25, 41 };
		System.out.println("Array-2 = " + Arrays.toString(arr2));

		// create new array with size to store both array elements
		int[] arr3 = new int[arr1.length + arr2.length];

		mergeArray(arr1, arr2, arr3);

		System.out.println("Merged Array = " + Arrays.toString(arr3));
	}

	static void mergeArray(int[] arr1, int[] arr2, int[] arr3) {
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				i++;
				k++;
			} else {
				arr3[k++] = arr2[j++];
			}
		} // while
		
		// to store the balance elements of first array
		for (; i < arr1.length; i++) {
			arr3[k++] = arr1[i];
		}

		// to store the balance elements of second array
		for (; j < arr2.length; j++) {
			arr3[k++] = arr2[j];
		}
		
	}

}
