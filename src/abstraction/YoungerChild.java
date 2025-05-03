package abstraction;

public class YoungerChild extends ElderChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ElderChild elder = new ElderChild();
		YoungerChild younger = new YoungerChild();
		
		younger.gotoShcool();
		younger.gotoShop();
		younger.gotoTution();
		
		YoungerChild younger2 = new YoungerChild("Indian");
		System.out.println(younger2.familyName);
		
	}
	
	// Constructor of the child class will call the constructor of the parent class
	public YoungerChild() {
		System.out.println("From the constructor of the Younger Child");
	}
	
	public YoungerChild(String familyName) {
		super(familyName);
		System.out.println("From the constructor of the Younger Child");
	}
	
	

	@Override
	public void gotoTution() {
		System.out.println("gotoTution implemented from "+ this.getClass());
		
	}

	@Override
	public void gotoShop() {
		
		System.out.println("gotoTution implemented from "+ this.getClass());
		
	}

}
