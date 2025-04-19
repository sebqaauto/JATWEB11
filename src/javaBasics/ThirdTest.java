package javaBasics;

public class ThirdTest {
	
	static boolean flag1;//default value false - memory occupied is 1 bit
	static boolean flag2 = true;
	
	static byte rollNum1; // default value is 0 and range supported is 2^8 => -128 to +127 
	static byte rollNum2 = -128;
	
	static char intial1 = 'A';
	static char intial2;// default value is empty
	
	static short houseNum1; // default value is 0 and range supported is 2^16 => -32, 768 to +32, 767 
	static short houseNum2 = 32767;
	
	static int phoneNum1;
	static int phoneNum2 = 2147483647;
	
	static long quantumNum = 9223372036854775807l;// mention the literal 'l' after the long number 
	static long quantumNum2 = 3889332;
	
	static float piValue1= 3.146666666689873f; // up to 7 decimals 
	static double piValue2 = 3.1466666666898736272783948462687288234;// up to 16 decimals 
	
	static int break_1;
	static String str;
	
	// Naming convention gives the clue 
	// If a keyword is completely in lower case it could be primitive 
	// If a keyword begins with a upper case letter then, it could be class type 
	
	public static void main(String[] arr) {
		
		System.out.println("Weekend batch -- Java");
		// keyword identifier  - type of the variable followed name of the variable 
		// variableType <variable name> = value;
		System.out.println(flag1);
		System.out.println("char default value :: "+ intial2);
		System.out.println("short default value :: "+ houseNum1);
		System.out.println("houseNum2 value :: "+ houseNum2);
		System.out.println("piValue of float :: "+ piValue1);
		System.out.println("piValue of double  :: "+ piValue2);
		
	}

}
