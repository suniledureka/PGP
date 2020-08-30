public class ArrayInitialization 
{
	public static void main(String[] args) 
	{
		int[] marks = {67,78,90,88,86};	
		System.out.println("No of Subjects = " + marks.length);
		
		/* array iteration using a for loop*/
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Mark for Subject-"+(i+1)+" = "+ marks[i]);
		}
		
		/* array iteration using enhanced for loop*/
		System.out.print("\nMarks Obtained  :   ");
		for(int mark : marks)
		{
			System.out.print(mark + " | ");
		}
		System.out.println();
		
		System.out.println(marks[5]); //java.lang.ArrayIndexOutOfBoundsException		
	}
}
