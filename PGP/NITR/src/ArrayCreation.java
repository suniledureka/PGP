import java.util.Scanner;

public class ArrayCreation {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		/*creating an integer array with size of 6*/		
		int[] marks = new int[6];
		System.out.println("enter 2 integers:");
		marks[0] = sc.nextInt();
		marks[1] = sc.nextInt();
		System.out.println("Size of Array = "+ marks.length);
		
		for(int x : marks) {
			System.out.print(x+"   ");
		}
		System.out.println();
		
		boolean[] status = new boolean[7];
		for(boolean n : status) {
			System.out.print(n+"   ");
		}
		System.out.println();
	
		String[] names = new String[10];
		for(String name : names) {
			System.out.print(name+"  ");
		}
	}
}
