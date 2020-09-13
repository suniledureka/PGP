package co.edureka.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		//create an instance of FileInputStream
		FileInputStream fin = new FileInputStream("src/co/edureka/io/java.txt");
		
		/*
		System.out.println("No of bytes to read = "+ fin.available());
		System.out.println(fin.read());
		System.out.println(fin.read());
		System.out.println("No of bytes to read = "+ fin.available());
		*/
		
		/*
		//to read file content byte-by-byte
		int n = fin.read();
		while(n != -1)
		{
	      System.out.print((char)n);
	      n = fin.read();
	      Thread.sleep(200); //200ms
		}
		*/
		
		/*
		//to read file contents completely - create a byte[] with the size of file
		byte[] b = new byte[fin.available()];
		//read complete contents of file to byte[]
		fin.read(b);
		String str = new String(b);
		System.out.println(str);
		*/
		
		
		//to read file contents line-by-line
		InputStreamReader file = new InputStreamReader(fin); //to convert byte stream to character stream
		BufferedReader br = new BufferedReader(file);
		String str = br.readLine();
		while(str != null) {
			System.out.println(str);
			str = br.readLine();
			Thread.sleep(2000); //2000ms
		}
		//close the stream
		fin.close();
	}

}
