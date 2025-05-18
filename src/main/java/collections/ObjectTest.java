package collections;

public class ObjectTest {
	

	public static void main(String[] args) {
	
		int intNum = 10;// Smaller
		long longNum = intNum;// Smaller value inside a Bigger data type - Upward casting
		long longNum2 = 9223372036854775807l;
		int intNum2 = (int) longNum2;
		intNum = (int) longNum; // Bigger value is shrinked to the smaller values capacity 
		//Downward casting 
		
		
		// Array of Objects 
		Object [] objects = new Object[3];
		// Upward casting 
		objects[0] = "IPL";//String
		objects[1] = "2025";
		objects[2] = 5.2f; // Float
		
		
		String str;
		//Downward casting or explicit casting 
		str = (String) objects[0];
		System.out.println(str);
		str = (String) objects[1];
		System.out.println(str);
		// This Lacks type safety 
		str = (String) objects[2];
		System.out.println(str);
		System.out.println(longNum2);
		System.out.println(intNum2);

	}

}
