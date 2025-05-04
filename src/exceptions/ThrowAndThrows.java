package exceptions;


public class ThrowAndThrows  {
	
	int i=0, j=1, result;
	
	int arr[];
	int arr2[] = {3,4};
	
	public void divide() throws ArrayIndexOutOfBoundsException, NullPointerException, ArithmeticException  {
		System.out.println("Current value of result is "+result);
		// Once the exception is handled the program runs as usual, if not it breaks
			// Unchecked exception parent is RuntimeException class
			arr2[2] = 34; // ArrayIndexOutOfBounds
			arr[0] =12; // NullPointer 
			result = j/i; // Arithmetic
			System.out.println(result);
			throw new ArithmeticException();
	}

	public static void main(String[] args) {
		ThrowAndThrows test = new ThrowAndThrows();
		System.out.println("Hello from main program before calling divide()");
		
		// Caller of a method should handle the exception 
		try {
			test.divide();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Hello from main program after calling divide()");
		test.add();
		ArrayIndexOutOfBoundsException object;
	}
	
	public void add() {
		result = j+i;
		System.out.println(result);
	}

}


