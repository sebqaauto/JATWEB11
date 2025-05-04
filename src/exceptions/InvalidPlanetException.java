package exceptions;

import java.util.Scanner;

public class InvalidPlanetException extends Exception {
	
	public InvalidPlanetException(String msg) {
		super(msg);
	}
	
	public static void checkPlanet(String planet) throws InvalidPlanetException {
		
		if(planet.equals("milkyway")) {
			throw new InvalidPlanetException("Not a valid planet - Enter only valid planets");
		}
	}

	public static void main(String[] args) {
		String planet;
		System.out.println("Enter a planet name :: ");
		Scanner scanner = new Scanner(System.in);
		planet = scanner.next();
		// Caller should handle the exception 
		try {
			checkPlanet(planet);
		} catch (InvalidPlanetException e) {
		System.out.println(e);
			e.printStackTrace();
		}
	}

}
