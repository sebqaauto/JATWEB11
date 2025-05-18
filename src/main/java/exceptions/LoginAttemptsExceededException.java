package exceptions;

import java.util.Scanner;

public class LoginAttemptsExceededException extends Exception {
	
	public LoginAttemptsExceededException(String msg) {
		super(msg);
	}
	
	// userName = 44567 ; password = password123
	static int  counter = 1;
	public static void login() throws LoginAttemptsExceededException {
		while(counter<=4) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the UserName :: ");
		String userName = scanner.next();
		System.out.println("Enter the Password :: ");
		String password = scanner.next();
		
		if(userName.equals("44567") && password.equals("password123") ) {
			System.out.println("Welcome back"+userName+ " your login was successfull ");
		}else if(counter==4) {
			throw new LoginAttemptsExceededException("Login exceeded 3 attempts - try after 30 mins");
		}
		else {
			
			System.out.println("Invalid Username or Password please try again - this is your"+counter+ " attempt");
			counter ++;
		}
		}
		
	}

	public static void main(String[] args) {
	try {
		login();
	} catch (LoginAttemptsExceededException e) {
		e.printStackTrace();
		
	}

	}

}
