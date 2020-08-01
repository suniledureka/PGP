package co.edureka.module1;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] arr = {15,24,85,12,6,9,16};
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);		
		System.out.println(Arrays.toString(arr));
	}
}
