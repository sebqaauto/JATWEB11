package abstraction;

public abstract class Father {
	
	String familyName;
	
	// method declaration 
	public abstract void gotoShop();
	
	public abstract void gotoShcool();
	
	public abstract void gotoTution();
	
	//public abstract void morningPrayer();
	
	// Final can't be overridden & abstract method should be overridden in the child
	// final abstract void gotoShop();
	
	// method definition 
	public void prepareDinner() {
		System.out.println("Preparing Dinner");
	}

	// Abstract class allows constructors to be created but it doesn't allow instantiation(Object creation)
	public Father() {
		System.out.println("Constructor of the Father ");
	}
	
	public Father(String familyName) {
		this.familyName = familyName;
		System.out.println("parameterised Constructor of the Father "+familyName);
	}
	

}
