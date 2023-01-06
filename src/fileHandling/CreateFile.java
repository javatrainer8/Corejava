package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {

		try {
			// object creation for File class
			File myObj = new File("D:\\New Batch - ADM21F024\\batchnew.txt");

			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			}

			else {
				System.out.println("File already exists or subnbjkhjk  ");
			}
		}

		catch (IOException e) {
			System.out.println("An error occurred.");

		}
	}

}