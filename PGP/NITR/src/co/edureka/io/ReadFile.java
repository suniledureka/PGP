package co.edureka.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReadFile {
 public static void main(String[] args) throws Exception
 {
	 FileInputStream fin = new FileInputStream("src/co/edureka/io/java.txt");
	 /*
	 System.out.println("No of bytes to read = "+ fin.available());
	 System.out.println(fin.read());
	 System.out.println(fin.read());
	 System.out.println("No of bytes to read = "+ fin.available());
	 */
	 
	 /*
	 //read file contents byte-by-byte
	 int n = fin.read();
	 while(n != -1) {
		 System.out.print((char)n);
		 n = fin.read();
		 Thread.sleep(150);//150ms
	 }
	 */
	 
	 /*
	 //read file contents completely
	 byte[] b = new byte[fin.available()]; //create a byte[] with size of file
	 fin.read(b);
	 String str = new String(b);
	 System.out.println(str);
	 */
	 
	 //read file contents line-by-line
	 InputStreamReader source = new InputStreamReader(fin); //to convert byte stream to character stream 
	 BufferedReader br = new BufferedReader(source);
	 String line = br.readLine();
	 while(line != null) {
		 System.out.println(line);
		 line = br.readLine();
		 Thread.sleep(2000);
	 }
	 fin.close();
	 
	 System.out.println("---------------------------");
	 String data = "A programming language is a medium for communication";
	 StringTokenizer st = new StringTokenizer(data);
	 while(st.hasMoreElements()) {
		 String s = st.nextToken();
		 System.out.println(s);
	 }
 }
}
