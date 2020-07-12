
public class ArrayCreation {

	public static void main(String[] args) {
		int[] marks = new int[7];
		marks[0]=98;
		marks[1]=92;
		System.out.println("Size of Array = " + marks.length);

		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+"   ");
		}
		System.out.println();
		
		double[] salaries = new double[10];
		for(double sal : salaries) {
			System.out.print(sal+"   ");
		}
		System.out.println();
		
		String[] names = new String[8];
		for(String name : names) {
			System.out.print(name+"   ");
		}
		System.out.println();
		
		boolean status[] = new boolean[6];
		for(boolean stat : status) {
			System.out.print(stat+"   ");
		}
	}
}