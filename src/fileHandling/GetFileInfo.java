package fileHandling;

import java.io.File;  // Import the File class

public class GetFileInfo {
 public static void main(String[] args) {
    
	 File myObj = new File("D:\\New Batch - ADM21F024\\batch24.txt");
    
    
    if (myObj.exists()) {
      System.out.println("File name: " + myObj.getName());    // file name 
      System.out.println("Absolute path: " + myObj.getAbsolutePath());   // exact path of the file 
      System.out.println("Writeable: " + myObj.canWrite());        // writable or not 
      System.out.println("Readable " + myObj.canRead());           // readable or not 
      System.out.println("File size in bytes " + myObj.length());  // bytes  
    } else {
      System.out.println("The file does not exist.");
    }
  }
}
