package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		
		File obj = new File("abc.txt");   // only object is created for File class ... file not created 
		obj.exists();
		System.out.println(obj.exists());  // false in first run 
		obj.createNewFile();                // file will create with name abc.txt
		System.out.println(obj.exists());  // true 
 	}

}
