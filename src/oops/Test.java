package oops;

public class Test {

	boolean flag;//false
	
	int year;
	
	public void setFlag() {
		flag = true;
		int year = 2026;//local variable 
		System.out.println(year);
	}
	
	public Test() {
		
	}
	
	// It allows one object to copy the attributes of another object
	public Test(Test temp) {
		
		this.year = temp.year;
	}
	
	public void printHI() {
		System.out.println("Hi");
		printHello();
	}
	
	public void printHello() {
		System.out.println("Hello");
		//printHI();
	}
		
	
	public static void main(String[] args) {
		
		Test test1 = new Test(); // flag = false
		Test test2 = new Test(); // flag = false
		test1.setFlag();// flag = true
		System.out.println("test2 :: "+test2.flag);
		System.out.println("test1 :: "+test1.flag);
		
		test1.year=2025;
		
		Test test3 = new Test(test1);
		
		System.out.println(test3.year);
		test1.printHI();

}
}