package javaBasics;

public class MultiDimensionalArray {
		
	static int [][] arr = new int [2][3];
	int arr1[] = {1,2,3,4};
	static String [][] studentInfo = new String[][] 
	{{"Name", "Dept", "City"}, 
	{"Rahul", "ECE", "Dehli"},
	{"Dhoni", "EEE", "Chennai"}, 
	{"Pant", "MECH", "Mumbai"}};
	
	public static void main(String[] args) {
		
		
		System.out.println(studentInfo.length);
		
		// Outer For loop for the rows 
		for(int i = 0; i<studentInfo.length; i++) {
			// Inner For loop for the columns 
			for(int j =0 ; j<studentInfo[i].length; j++) {
				System.out.print(studentInfo[i][j] + "  ");
			}
			System.out.println();
		}
		
		for (String[] string : studentInfo) {
			for (String string2 : string) {
				System.out.print(string2+ " ");
			}
			System.out.println();

			
		}
		

	}

}
