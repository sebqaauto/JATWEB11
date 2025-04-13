import java.util.Scanner;

public class IfElseIfTest {
	
	static int dayOfTheWeek;

	public static void main(String[] args) {
		
		System.out.println("Enter a integer value from 1 to 7 :: ");
		
		// Scanner class is used to get the input from the console or outside the program
		Scanner objectScanner = new Scanner(System.in);
		dayOfTheWeek = objectScanner.nextInt();
		
		if(dayOfTheWeek == 1) {
			System.out.println("It's Monday!");
		}else if(dayOfTheWeek == 2) {
			System.out.println("It's Tuesday!");
		}else if(dayOfTheWeek == 3) {
			System.out.println("It's Wednesday!");
		}else if(dayOfTheWeek == 4) {
			System.out.println("It's Thrusday!");
		}else if(dayOfTheWeek == 5) {
			System.out.println("It's Friday!");
		}else if(dayOfTheWeek == 6) {
			System.out.println("It's Saturday!");
		}else if(dayOfTheWeek == 7) {
			System.out.println("It's Sunday!");
		}else {
			System.out.println("You entered a value outside the range of 1 to 7");
		}

	}

}
