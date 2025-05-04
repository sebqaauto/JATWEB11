package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

	
	public static void accessFile() throws FileNotFoundException {
		
		FileReader fileReader = new FileReader("eclipse-workspace/JavaTest/src/exceptions/sample.txt");
	}
	
	
	
	public static void main(String[] args)  {
	
		// Checked or compile time  - Parent class is IOException 
		try {
			FileReader fileReader = new FileReader("/Users/sebastianselvarajaugustine/eclipse-workspace/JavaTest/src/exceptions/sample.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			accessFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		
		
		System.out.println("Hi from main method after exception ");
		
	}

}
