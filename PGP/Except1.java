class Except1 
{
	public static void main(String[] args) 
	{
		try{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int z = x/y;
			System.out.println("Result = "+z);
		}
		catch(ArithmeticException ex){
			System.out.println("Exception: Cannot divide a number by zero!");
		}

		System.out.println("-- DONE --");
	}
}
