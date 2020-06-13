class Except2 
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
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Exception: Please provide min 2 cmd args");
		}
		catch(NumberFormatException ex){
			System.out.println("Exception: Please provide numbers as cmd args");
		}
		System.out.println("-- DONE --");
	}
}
