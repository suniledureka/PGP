package co.edureka.io;

import java.io.FileOutputStream;

public class WriteFile {

	public static void main(String[] args) throws Exception
	{
		FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.xls");
		//FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt",true); //true-appending mode
		String str = "Edureka is an online training provider with the most effective learning system in the world. We help professionals learn trending technologies for career growth.";
		
		/*
		for(int i=0;i<str.length();i++)
		{
			int b = str.charAt(i);
			fout.write(b);
		}
		*/
		
		byte[] data = str.getBytes(); //to convert a String byte byte array
		fout.write(data);
		
		System.out.println("file created!");
		fout.close();
	}
}
