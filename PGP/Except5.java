class Except5 
{
	public static void main(String[] args) 
	{
		try{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int res = x/y;
			System.out.println(x+" / "+y+" = "+res);
		}
		catch(Exception ex){
			System.out.println("Exception Occured!");
			System.out.println("Message: "+ ex.getMessage());
			System.out.println("toString(): "+ ex.toString());
			System.out.println("-----------------------");
			ex.printStackTrace();
		}
		System.out.println("-- DONE --");
	}
}
