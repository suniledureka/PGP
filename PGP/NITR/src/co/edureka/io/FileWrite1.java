package co.edureka.io;

import java.io.File;
import java.io.FileOutputStream;

public class FileWrite1 {

	public static void main(String[] args) throws Exception {
		File file = new File("src/co/edureka/io/edureka.xls");
		
		if(file.exists())
			System.out.println("File is already available!");
		else {
		FileOutputStream fout = new FileOutputStream(file);
		
		
		String str = "Edureka is an online training provider with the most effective learning system in the world. We help professionals learn trending technologies for career growth.";
		byte[] b = str.getBytes(); //to convert a String to bytes
		
		//to write data to file
		fout.write(b);
		System.out.println("file created!");		
		fout.close();
		}
	}

}
