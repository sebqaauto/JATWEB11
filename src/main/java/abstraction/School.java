package abstraction;

public interface School {
	
	// 100 % abstraction 
	
	// Static constants -  variables in the interface are final, public, and static.
	
	String schoolName ="Chennai Public School";
	int yearOfInception = 2025;
	
	// Methods - are all abstract and by default public 
	 void morningPrayer();
	 String shcoolStartTime();
	 String shcoolEndTime();
	


}
