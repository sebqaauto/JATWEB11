package abstraction;

public abstract class ElderChild extends Father {


	@Override
	public void gotoShcool() {
		// TODO Auto-generated method stub
		System.out.println("gotoShcool implemented from "+ this.getClass());
	}
	
	public ElderChild() {
		//super();
		System.out.println("From the constructor of the Elder Child");
	}
	
	public ElderChild(String familyName) {
		super(familyName);
		System.out.println("From the parameterised constructor of the Elder Child " +familyName);
	}
	
	/*
	 * When you extend from a abstract class 
	 * 1) Implement all the abstract class in to your class
	 * 2) Make the current class as abstract if not implementing all the abstract methods
	 */

}
