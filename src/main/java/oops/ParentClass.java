package oops;
// Every class in java has java.lang package(inbuilt)
// Every class extends/inherits Object(super most class)
public class ParentClass {
	
	// Attributes of the parent class 
	String name;
	int age;
	int year;
	int fund = 10000;
	/*
	 * When you add final keyword to a variable it becomes a constant 
	 */
	final boolean sellProperty = false;

	public void celebrateVillageFestival() {
		System.out.println("We celebrate our village/town festival");
	}
	
	public void donateToCharity() {
		
		System.out.println("This family donates to charity (from ParentClass) :: "+fund);
	}
	
	final void contestElection() {
		System.out.println("No one from this family will be the head of the village");
	}
	
	public void setHouseName(String name) {
		System.out.println("The house name is from the parent class "+name);
	}
	
	public int houseNumber() {
		
		return 10;
	}
	public static void main(String[] args) {
		

	}

}
