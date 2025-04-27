package oops;

public class ChildClass extends ParentClass{
	
	int fund = 100000;
	/*
	 * 1) Same Return type
	 * 2) Same number and type of Parameters 
	 * 3) Same method 
	 */
	
	// Overriding the parent class
	public void donateToCharity() {
		System.out.println("This family donates to charity (from Childclass) :: "+fund);
		super.donateToCharity();
		System.out.println("The given by my parent is "+ super.fund);
	}
	
	// Overridden the Parent class 
	public void setHouseName(String name) {
		System.out.println("The house name is from the child class "+name);
		super.setHouseName(name);
	}
	
	public int houseNumber() {
		
		return 12;
	}
	
	// I can't override the final method 
	//public void contestElection() {
	//	System.out.println("No one from this family will be the head of the village");
	//}

	public static void main(String[] args) {
		
		ChildClass child = new ChildClass();
		// Reused the behavior of the parent 
		child.celebrateVillageFestival();
		child.donateToCharity();
		ParentClass parent = new ParentClass();
		parent.donateToCharity();
		// I can't reassign a value to the final variable(constant)
		//child.sellProperty = true;
		child.contestElection();
		System.out.println("My parent's decision to sell property is :: "+child.sellProperty);
		child.setHouseName("Dhoni");
		
		
	}

}
