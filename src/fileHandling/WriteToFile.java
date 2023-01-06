package fileHandling;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteToFile {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("D:\\New Batch - ADM21F024\\batch24.txt");
      
      // writing content by using write() method                 
      myWriter.write("This content I am writing through Java program...........");
      // close method 
      myWriter.close();
      
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      
    }
  }
}