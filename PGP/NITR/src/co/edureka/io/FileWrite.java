package co.edureka.io;

import java.io.FileOutputStream;

public class FileWrite {

	public static void main(String[] args) throws Exception {		
		//FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt");
		FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt", true);
		
		String str = "Edureka is an online training provider with the most effective learning system in the world. We help professionals learn trending technologies for career growth.";
		byte[] b = str.getBytes(); //to convert a String to bytes
		
		//to write data to file
		fout.write(b);
		System.out.println("file created!");
		fout.close();
	}

}
