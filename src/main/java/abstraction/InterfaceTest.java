package abstraction;

public interface InterfaceTest {
	
	// 100% abstraction
	
	public static void print() {
		System.out.println("Hi from the print method");
	}
	
	public static void main(String []a) {
		
		//InterfaceTest test = new InterfaceTest();
		
		print();
	}

}
