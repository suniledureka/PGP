package co.edureka.io;

import java.io.FileOutputStream;
import java.io.FileWriter;


public class FileWrite {

	public static void main(String[] args) throws Exception{
		String str = "Edureka is an online training provider with the most effective learning system in the world. We help professionals learn trending technologies for career growth.\n";
		
		//FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt");
		FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt",true); //appending mode
		byte[] b = str.getBytes(); // to convert String to byte[]
		fout.write(b);
		System.out.println("File Saved!");
		fout.close();
		
		System.out.println("---------------------------------");
		FileWriter fw = new FileWriter("src/co/edureka/io/edureka1.txt");		
		fw.write(str);
		System.out.println("File Saved!");
		fw.close();		
	}
}
