package oops;

public class StaticNonStaticTest {
	
	
	
	static void printSomething() {
		
		System.out.println("Hi from the printSomething block");
		
	}
	
	// Instance method
	public void doSomething() {
		System.out.println("Hi from the doSomething block");
		printSomething();
	}
	

	public static void main(String[] args) {
		
		System.out.println("Hi from the main block");
		
		printSomething();
		
		StaticNonStaticTest test = new StaticNonStaticTest();
		test.doSomething();
		
		new StaticNonStaticTest().doSomething();

	}
	
	static {
		System.out.println("Hi from the static block1 ");
	}
	
	static {
		System.out.println("Hi from the static block2 ");
	}
	
	

}
