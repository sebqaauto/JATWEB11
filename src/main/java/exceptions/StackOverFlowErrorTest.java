package exceptions;

public class StackOverFlowErrorTest {

	public static void main(String[] args) {
		StackOverFlowErrorTest test = new StackOverFlowErrorTest();
		test.printHi();
	/*/
	 *  It triggers java.lang.StackOverflowError caused due to,
	 *   too many method invocations and once an error occurs 
	 *   the program can never recover, it exits out it 
	 */
		
	}
	

	public void printHi() {
		System.out.println("From the print Hi method ");
		printHello();
	}
	
	public void printHello() {
		System.out.println("From the print Hello method ");
		printHi();
	}

}
