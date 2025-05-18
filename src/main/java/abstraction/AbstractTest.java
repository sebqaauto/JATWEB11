package abstraction;

public abstract class AbstractTest {

	// When you see an abstract class but no abstract methods in it then possibly it is done so to avoid instantiation 
	
	public void print() {
		System.out.println("Hi from the abstract class");
		// AbstractTest test = new AbstractTest();
	}
	public AbstractTest() {
		
	}
	
	AbstractTest test;
	
}
