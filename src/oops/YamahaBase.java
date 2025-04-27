package oops;

public class YamahaBase {

	int max_speed =100;
	final int wheels = 2;
	int suspensions = 1;
	
	public void getMaxSpeed() {
		System.out.println("From the YamahaBase class "+max_speed);
	}
	
	public void getSuspensions() {
		System.out.println("From the YamahaBase class "+suspensions);
	}
	
	public YamahaBase() {
		System.out.println("From the constructor of the YamahaBase");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
