package oops;

public class Family {

	//Attributes - instance variables - scope => is at class level
	String name;
	int age;
	String gender;
	static int counter = 1;
	
	// overriding the default constructor 
	public Family(){
		System.out.println("New member is being created in the family");
	}
	
	public void bedRoom() {
		// Local variables
		String bed = "Sleapyhead";
		String wardrobe = "Urban Ladder";
	}
	
	public Family(String name, int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println("New member is being created in the family using parameterised constructor:: "+counter);
		counter++;
	}
	
	public static void main(String[] args) {
		
		Family grandFather;
		
		Family father = new Family("Dhoni", 44, "Male");
		
//		Family father = new Family();// default constructor 
//		father.name = "Dhoni";
//		father.age = 44;
//		father.gender = "Male";
		
		Family mother = new Family("Sakshi", 42, "Female");
		Family firstChild = new Family("zia", 12, "Female");
		Family secondChild = new Family("Rahul", 6, "Male");
		father.bedRoom();
		//father.nameStr="";
		
		System.out.println(father.name+" "+father.age+" "+father.gender);
		System.out.println(mother.name+" "+mother.age+" "+mother.gender);
		System.out.println(firstChild.name+" "+firstChild.age+" "+firstChild.gender);
		System.out.println(secondChild.name+" "+secondChild.age+" "+secondChild.gender);
		
		
	}

}
