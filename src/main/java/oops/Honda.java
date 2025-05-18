package oops;

public class Honda {
	// Attributes
	// Instance variables - controlled by instances/objects - objects will have a copy of it
	String carName;
	String launchYear;
	String carColor;
	
	// Static variables - associated with the class - objects can't have a copy of it
	static String country = "Japan";

	public static void main(String[] args) {
		
		// Creating an object using new keyword & constructor of class
		Honda object1 = new Honda();
		object1.carName ="Honda City";
		System.out.println("Car name for Object1 :: "+ object1.carName);
		
		Honda object2 = new Honda();
		System.out.println("Car name for Object2 :: "+ object2.carName);
		
		country ="Japan Nation";// It doesn't need the help of an object 
		
		System.out.println("Country name for Object2 :: "+ object2.country);
		System.out.println("Country name for Object1 :: "+ object1.country);
		
		object2.country="Japanese";

		System.out.println("Country name for Object1 :: "+ object1.country);
	

	}

}
