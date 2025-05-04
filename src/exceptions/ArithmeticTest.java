package exceptions;

public class ArithmeticTest {
	
	int i=0, j=1, result;
	
	int arr[];
	int arr2[] = {3,4};
	
	public void divide() {
		System.out.println("Current value of result is "+result);
		// Once the exception is handled the program runs as usual, if not it breaks
		try {
			// Unchecked exception parent is RuntimeException class
			arr2[2] = 34; // ArrayIndexOutOfBounds
			arr[0] =12; // NullPointer 
			result = j/i; // Arithmetic
			System.out.println(result);

		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("from the ArrayIndexOutOfBoundsException block'");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e);
			System.out.println(e.getClass());
			
		}catch(NullPointerException e) {
			System.out.println("from the NullPointerException block'");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e);
			System.out.println(e.getClass());
			
		}
		catch(Exception e) {
			System.out.println("from the RuntimeException block'");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e);
			System.out.println(e.getClass());
			
		}finally {
			i=1; 
			j=2;
			System.out.println("Reset the values of i & j" +i+ " "+j);
		}
		
		
	}

	public static void main(String[] args) {
		ArithmeticTest test = new ArithmeticTest();
		System.out.println("Hello from main program before calling divide()");
		test.divide();
		System.out.println("Hello from main program after calling divide()");
		test.add();
		ArrayIndexOutOfBoundsException object;
	}
	
	public void add() {
		result = j+i;
		System.out.println(result);
	}

}
