package co.edureka.io;

import java.io.FileOutputStream;

public class WriteFile {

	public static void main(String[] args) throws Exception {
		FileOutputStream fout = new FileOutputStream("src/edureka.txt");
		String data = "Edureka is an online training provider with the most effective learning system in the world. We help professionals learn trending technologies for career growth.";
		/*
		FileWriter fout = new FileWriter("src/edureka.txt");		
		fout.write(data);
		*/
		
		byte[] b = data.getBytes(); //to convert a String to byte[]
		fout.write(b);
		
		System.out.println("file created");
		fout.close();
	}

}
