package streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// java.io = input and output 
public class FileReaderWriter {
	
	// Establish a Stream to connect with file systems
	
	FileInputStream fis;
	FileOutputStream fos;
	String toWrite = "Hello, I'm writing this information to the file system !!!"
			+ "From the Second line "
			+ "Third Line --- !!"
			+ " Fourth Line --- " ;
	
	public void fileReader() throws IOException {
		fis = new FileInputStream("/Users/sebastianselvarajaugustine/eclipse-workspace/JavaTest/src/Streams/FirstFile.txt");
		int sizeOfBytes = fis.available();// returns the size of the bytes in the file
		byte[] bytesOfData = new byte[sizeOfBytes];
		fis.read(bytesOfData);
		
		for (byte b : bytesOfData) {
			System.out.print(b);
		}
		System.out.println();
		// byte to String 
		String result = new String(bytesOfData);
		System.out.println(result);
	}
	
	// IOException is the parent of FileNotFoundException
	public void fileWriter() throws IOException {
		// Establish the I/O Stream 
		fos = new FileOutputStream("/Users/sebastianselvarajaugustine/eclipse-workspace/JavaTest/src/Streams/FirstFile.txt");
		// Convert the String in to byte[]
		byte [] stringAsBytes = toWrite.getBytes();
		// Write the byte[] to the file
		fos.write(stringAsBytes);
		// After an I/O operation always close the stream 
		fos.close();
		// Once the stream is closed you can't perform any operation with the stream 
		//fos.write(stringAsBytes);
		
	}
	

	public static void main(String[] args) {
	
		FileReaderWriter readWrite = new FileReaderWriter();
		
//		try {
//			readWrite.fileWriter();
//			System.out.println("The file write operation is complete ;;;;");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			readWrite.fileReader();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
