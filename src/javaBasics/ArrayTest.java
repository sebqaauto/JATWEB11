package javaBasics;

public class ArrayTest {

	// Mention the size of the array or initialize 
	static int[] intArr = new int[4]; // Array size is fixed 
	static float [] floatArr = new float[] {10.05f, 20.89f, 30.78f};
	static float [] floatArr2 = {10.05f, 20.89f, 30.78f};// initialize the array with values
	static double doubleArr[] = new double[5];
	static String [] students = new String[] {"Rahul", "Virat", "Dhoni", "Pant"};
	static char[] charArr; // only declaration of an array will only be null, nothing can be stored 
	
	public static void main(String[] args) {
		
		intArr[0] = 1;
		intArr[1] = 2;
		intArr[2] = 3;
		intArr[3] = 4;
		floatArr[2] = 34.56f;
		//charArr[0] = 'A';
		
		for (int temp : intArr) {
			System.out.println("From the for each loop :: "+temp);
		}
		
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		//System.out.println(intArr[4]);
		System.out.println(floatArr[2]);
		System.out.println(students.length);
		
		// To print elements inside the array use a for loop
		
		for(int i = 0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		
		// for each
		for (String str : students) {
			System.out.println(str);
		}
		
		for(int i = 0; i<students.length; i++) {
			System.out.println(students[i]);
		}
		
	}

}
