package javaBasics;

public class StringMethodsTest {

	
	static String student1 = "Rahul R";
	static String student2 = new String("Rahul SEDRE");
	static String student3 = "Rahul ABD Rahul Rahul";
	static String student4 = "Virat Kohli";
	
	public static void main(String[] args) {
		
		System.out.println(student1.length());
		System.out.println(student2.charAt(10));
		System.out.println(student4.substring(3));
		System.out.println(student4.substring(0,4));
		//Concatenation of Strings
		System.out.println(student4.concat(student1));
		System.out.println(student4+student1);
		System.out.println(student4);
		System.out.println(student1);
		
		System.out.println(student3.indexOf("ABD"));
		System.out.println(student3.lastIndexOf("Rahul"));
		String day1 = "Monday";
		String day2 = "monday";
		System.out.println(day1.equals(day2));
		System.out.println(day1.equalsIgnoreCase(day2));
		System.out.println(day1.toLowerCase());
		System.out.println(day2.toUpperCase());
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(student3.contains("ABD"));
		System.out.println(student3.replace("ABD", "FEG"));
		System.out.println(student3);
		System.out.println(student4.startsWith("Virat"));
		
		
		
		
		
		
	
	}

}
