import java.util.Scanner;

public class SwitchCaseTest {
	
	static int dayOfTheWeek;
	static String month; // month is of Object type

	public static void main(String[] args) {
		System.out.println("Enter a integer value from 1 to 4 :: ");
		
		// Scanner class is used to get the input from the console or outside the program
		Scanner objectScanner = new Scanner(System.in);
		dayOfTheWeek = objectScanner.nextInt();
		
		System.out.println("Enter a month value from 1 to 6 :: ");
		month = objectScanner.next();
		
		//Similar to If-ElseIf 
		switch(dayOfTheWeek) {
		
		case 1: 
			System.out.println("It's Monday");
			break;
		case 2: 
			System.out.println("It's Tuesday");
			break;
		case 3: 
			System.out.println("It's Wednesday");
			break;
		case 4: 
			System.out.println("It's Thursday");
			break;
		default:
			System.out.println("The value you entered is out of the range 1 to 4 ");
			break;
		
		}
		
		// Switch case number 2;
		

		switch(month) {
		
		case "One": 
			System.out.println("It's January");
			break;
		case "Two": 
			System.out.println("It's Feburary");
			break;
		case "Three": 
			System.out.println("It's March");
			break;
		case "Four": 
			System.out.println("It's April");
			break;
		case "Five": 
			System.out.println("It's May");
			break;
		case "Six": 
			System.out.println("It's June");
			break;
		default:
			System.out.println("The value you entered is out of the range 1 to 6 ");
			break;
		
		}

	}

}
