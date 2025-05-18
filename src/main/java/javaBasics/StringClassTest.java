package javaBasics;

public class StringClassTest {
	// new keyword is used create a new memory 
	static int num;
	static String student1 = "Rahul"; // Recommended
	static String student2 = new String("Rahul");
	static String student3 = "Rahul";
	static String student4 = "Virat";


	public static void main(String[] args) {
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		student4 = "Yuvi";
		
		if(student1==student2) {
			System.out.println("They are the same");
			
		}
		
		// == in String checking memory location 
		if(student1==student3) {
			System.out.println("They are the same"+ student1 + student3);
			
		}
		
		student3 = "Yuvi";
		if(student4==student3) {
			System.out.println("They are the same"+ student4 + student3);
			
		}
		
		// To compare two Strings always use equals()
		if(student1.equals(student2)) {
			System.out.println("They have the same value "+student1+student2);
		}
	}

}
