package co.edureka.except;
class Edureka
{
	void logic() throws InterruptedException
	{
	  System.out.println(".... business logic....");	
	}
}

public class ThrowsTest 
{
	public static void main(String[] args) throws Exception
	{
		Edureka edu = new Edureka();
		//try {
			edu.logic();
		//}catch(Exception ex) {}
	}
}
