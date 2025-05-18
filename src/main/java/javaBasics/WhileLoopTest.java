package javaBasics;

public class WhileLoopTest {

	public static void main(String[] args) {
		// While Loop
		// Initialization
		int iteration = 0;
		int iteration2 = 13;
		// Condition 
		while(iteration <=10) {
			System.out.println("Hello from the while loop:: "+ iteration);
			// Updation
			iteration++;
		} // Go and check while statement until it becomes false

		// Loop - initialization, condition, updation 
		
		// do ... while - will run the loop at least one time
		
		do {
			System.out.println("Hello from the do while loop:: "+ iteration2);
			iteration2++;
		}while(iteration2 <=14);
	}
	
	
	

}
