package exceptions;

public class IllegalAgeException extends Exception {
	
	public IllegalAgeException(String message) {
		super(message);
	}

	
	public static void main(String[] args) throws IllegalAgeException {
		// Custom Exception 
		electionVote(17);
		
		showVoterInfo("Prakash");
	}
	
	public static void electionVote(int age) throws IllegalAgeException {
		int i=1, j=0;
		//int result = i/j;
		if(age == 18) {
			throw new ArithmeticException("Overriding by the user for / by zero");
		}
		if(age>18) {
			System.out.println("You are allowed to Vote in the election ");
		}else {
			//IllegalAgeException ageException = new IllegalAgeException("Illegal Age below 18");
			throw new IllegalAgeException("Illegal Age below 18");
		}
		
	}
	
	public static void showVoterInfo(String name) {
		System.out.println("Hi "+name+" welcome back ");
	}

}
