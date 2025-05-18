package oops;

public class YamahaR15 extends YamahaBase {

	int max_speed = 180;
	int suspensions = 2;
	
	public void getMaxSpeed() {
		super.getMaxSpeed();
		System.out.println("From the YamahaR15 class "+max_speed);
	}
	
	public void getSuspensions() {
		System.out.println("From the YamahaR15 class "+suspensions);
	}
	
	public YamahaR15() {
		//super(); - by default the constructor of the child class calls the constructor
		// of the parent class 
		System.out.println("From the constructor of the YamahaR15");
	}
	
	public int getMaxSpeedDiff() {
		 return (this.max_speed - super.max_speed);
	}
	
	public static void main(String[] args) {
		
		YamahaR15 r15 = new YamahaR15();
		System.out.println(r15.wheels);
		r15.getMaxSpeed();
		//YamahaBase yamaha = new YamahaBase();
		//yamaha.getMaxSpeed();
		int result = r15.getMaxSpeedDiff();
		System.out.println("The speed difference is "+result);
		System.out.println("The speed difference is "+r15.getMaxSpeedDiff());
	}

}
