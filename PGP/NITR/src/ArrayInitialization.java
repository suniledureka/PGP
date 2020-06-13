
public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = {98,96,73,81,65,70};
		System.out.println("No of Subjects = "+ marks.length);
		
		/* array iteration using a normal for loop*/
		for(int i=0;i<marks.length;i++) {
			System.out.println("Mark for Subject-"+(i+1)+" = "+ marks[i]);
		}
		
		/*array iteration using enhanced for loop from Java 5 */
		System.out.println("---- Marks Obtained ----------");
		
		for(int mark : marks) {
			System.out.print(mark+" | ");
		}
		System.out.println();
		System.out.println(marks[6]); //java.lang.ArrayIndexOutOfBoundsException
	}
}
