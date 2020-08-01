package co.edureka.module1;

import java.util.Arrays;

public class MergeSort {
	int[] array;
	int[] tempMergeArr;
	int length;
	public static void main(String[] args) {
		int[] inputArr = {48,36,13,52,19,94,21};
		System.out.println("Original Array = "+ Arrays.toString(inputArr));
		
		MergeSort ms = new MergeSort();
		ms.sort(inputArr);
		for(int n : inputArr) {
			System.out.print(n+"\t");
		}
		System.out.println();
	}

	void sort(int[] inputArr) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergeArr = new int[length];
		divideArray(0,length-1);		
	}

	public void divideArray(int lowerIndex, int higherIndex) 
	{
		if(lowerIndex < higherIndex) {
			int middle = lowerIndex+(higherIndex-lowerIndex)/2;
			
			//it will sort the left side of an array
			divideArray(lowerIndex,middle);
			//it will sort the right side of an array
			
			divideArray(middle+1,higherIndex);
					
			mergeArray(lowerIndex,middle,higherIndex);
		}
	}
	
	void mergeArray(int lowerIndex, int middle, int higherIndex) {
		for(int i=lowerIndex;i<=higherIndex;i++) {
			tempMergeArr[i]=array[i];
		}
		
		int i=lowerIndex, j=middle+1, k=lowerIndex;
		while(i<=middle && j<=higherIndex) {
			if(tempMergeArr[i]<=tempMergeArr[j]) {
				array[k++] = tempMergeArr[i++];
			}
			else
				array[k++] = tempMergeArr[j++];
		}
		
		while(i<=middle)
			array[k++]= tempMergeArr[i++];
		while(i<=middle)
			array[k++]= tempMergeArr[i++];		
		
	}
}