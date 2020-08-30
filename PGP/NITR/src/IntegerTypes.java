
public class IntegerTypes {

	public static void main(String[] args) 
	{
	  //byte b = 128;	//Type mismatch: cannot convert from int to byte
	  byte b = 127;	
	  System.out.println(b);
	  
	  long pop = 9858478457L;
	  System.out.println("World Population = " + pop);	  
	  
	  int n = (int)12L;
	  System.out.println(n);
	  
	  byte x = (byte)500;
	  System.out.println(x);
	}
}

