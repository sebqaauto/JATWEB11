package javaBasics;

public class SecondTest {

	public static void main(String[] args) {
		System.out.println("Hello from the SecondTest Class");
		SecondTest test = new SecondTest();
		test.printHello();
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
