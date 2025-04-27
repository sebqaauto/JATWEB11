package oops;

public class OverloadingTest {
	
	/*
	 * 1) Number of arguments 
	 * 2) Type of arguments 
	 * 3) The Order of the arguments could be different 
	 */
	
	public int add(int a, int b) {
		System.out.println("Method with 2 arguments were called");
		return a+b;	
	}
	
	public int add(int a, int b, int c) {
		System.out.println("Method with 3 arguments were called");
		return a+b+c;	
	}
	
	public int add(int a, int b, int c, int d) {
		System.out.println("Method with 4 arguments were called");
		return a+b+c;	
	}
	
	public float add(float a, int b, int c) {
		System.out.println("Method with 3 arguments were called where argument 1 is a float var");
		return (a+b+c);	
	}
	
	public float add(int a, float b, int c) {
		System.out.println("Method with 3 arguments were called where argument 2 is a float var");
		return (a+b+c);	
	}

	// VarArgs - Variable Arguments <data_type>...<var_name> the values inside var args are stored as an Array
	
	public int add(int...a) {
		System.out.println("Method with int var args was called");
		int result =0;
		for (int temp : a) {
			result = result+temp;
		}
		return result;
	}
	
	public float add(float...a) {
		System.out.println("Method with float var args was called");
		float result =0;
		for (float i : a) {
			//result = result+i;
			result += i;
		}
		return result;
	}
	
	// Var args parameter should be the only argument or the last  argument 
	public float add(int a, float...b) {
		System.out.println("Method with int and float var args was called");
		float result =0;
		for (float i : b) {
			//result = result+i;
			result += i;
		}
		return result+a;
	}

	public static void main(String[] args) {
		
		OverloadingTest test = new OverloadingTest();
		float result = test.add(56, 89);
		System.out.println(result);
		result = test.add(34, 23, 45);
		System.out.println(result);
		result = test.add(34.5f, 5, 66);
		System.out.println(result);
		result = test.add(23, 3.144f, 33);
		System.out.println(result);
		result = test.add(2,3,4,5);
		System.out.println(result);
		result = test.add(4, 5, 6, 7, 8, 9, 10, 11);
		System.out.println(result);
		result = test.add(4.9f, 5.9f, 6.3f, 7.112f, 8, 9, 10, 11);
		System.out.println(result);
		result =test.add(2, 3.4f, 4.5f, 6.5f, 4);
		System.out.println(result);
		
		
	}

}
