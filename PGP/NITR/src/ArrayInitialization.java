
public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = {92,83,96,74,90,76};
		
		System.out.println("No of Subjects = "+ marks.length);
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Mark for Subject-"+(i+1)+" = "+ marks[i]);
		}
		
		/*array iteration using enhanced for loop*/
		System.out.print("Marks Obtained  : ");
		for(int mark : marks)
		{
			System.out.print(mark + " , ");
		}
		System.out.println();
		
		System.out.println(marks[6]); //java.lang.ArrayIndexOutOfBoundsException
	}
}
