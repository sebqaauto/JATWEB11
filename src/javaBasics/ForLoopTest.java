package javaBasics;

import java.util.Scanner;

public class ForLoopTest {

	public static void main(String[] args) {
		int intialValue;
		int finalValue;
		
		System.out.println("Enter the initial value of the For Loop :: ");
		Scanner scnObject = new Scanner(System.in);
		intialValue = scnObject.nextInt();
		
		System.out.println("Enter the finalValue  of the For Loop :: ");
		finalValue = scnObject.nextInt();
		
		for(int i = intialValue; i<= finalValue; i++) {
			System.out.println("For Loop :: "+i);
		}

	}

}
