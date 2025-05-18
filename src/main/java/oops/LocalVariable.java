package oops;

public class LocalVariable {
	
	int year = 2025;
	
	
	public void set() {
		int year = 2026;//local variable 
		System.out.println(year);
		System.out.println(this.year);
		
		// this - refers to the current class & it helps to point 
		// to the instance variables of the class
	}
	

	public static void main(String[] args) {
		
		LocalVariable obj = new LocalVariable();
		obj.set();
	}

}
