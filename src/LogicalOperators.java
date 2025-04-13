
public class LogicalOperators {
	// Logical operators will also return a boolean value - true or false
	
	static int a = 10;
	static int b = 8;
	static int c = 9;
	static int d = 7;
	static int e = 16;

	public static void main(String[] args) {
		
		// Logical && is used when multiple variables needs to compared - it returns true only when all the conditions are true 
		
		if(a>b && a>c && a>d) {
			System.out.println("a is greater than all the values  :: " + (a>b && a>c && a>d));
		}
		
		if(a>b && a>c && a>d && a>e) {
			System.out.println("a is greater than all the values  :: " + (a>b && a>c && a>d && a>e));
		}
		else {
			System.out.println("a is not greater than all the values  :: " + (a>b && a>c && a>d && a>e));
		}
		
		// Logical || it returns true when at least one of the condition is true
		
		if(a>b || a>c || a>d || a>e) {
			System.out.println("a is greater than all the values  :: " + (a>b || a>c || a>d || a>e));
		}
		else {
			System.out.println("a is not greater than all the values  :: " + (a>b || a>c || a>d || a>e));
		}
		
	}

}
