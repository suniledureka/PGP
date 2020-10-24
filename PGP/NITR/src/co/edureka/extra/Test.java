package co.edureka.extra;

public class Test {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30};
		int[] arr2 = {10,20,30};
		System.out.println(arr1 == arr2);
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
	}

}
