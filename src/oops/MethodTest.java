package oops;

public class MethodTest {
	
	int a = 12;
	int A = 15;
	
	/*
	 * Access modifier - Not Mandatory ; 
	 * Return type - Mandatory ; 
	 * Method Name - Mandatory
	 * Parameters - Not Mandatory ; 
	 * Exceptions List - Not Mandatory;
	*/

	// Instance methods
	public void addition(){
		System.out.println("The sum is "+ (a+A));
	}
	
	public void multiplication(){
		
		System.out.println("The product is "+ a*A);
	}
	
	public int addition2(){
		
		return a+A;
	}
	
	public int multiplication2(){
		
		return a*A;
	}
	
	public MethodTest() {
		System.out.println("The constructor  is invoked");
	}
	
	public static void main(String[] args) {
		
		MethodTest test = new MethodTest();
		test.addition();
		test.multiplication();
		
		int addResult = test.addition2();
		int mulResult = test.multiplication2();
		
		System.out.println(addResult);
		System.out.println(mulResult);
		
		 
		
	}

}
