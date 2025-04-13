package javaBasics;

public class NestedIfElse {
	
	// Variables 
	static int a = 10;
	static int b = 8;
	static int c = 9;
	static int d = 17;
	static int e = 2;
	static int f = 3;

	public static void main(String[] args) {
		
		if(a>b) {
			System.out.println("Outer If ");
			System.out.println("a is greater than b  :: " + (a>b));
			//Nested If
			if(a>c) {
				System.out.println("Nested If - 1 ");
				System.out.println("a is greater than c  :: " + (a>c));
				//Nested If
				if(a>d) {
					System.out.println("Nested If - 2 ");
					System.out.println("a is greater than d  :: " + (a>d));
				}
				else {
					System.out.println("Inner Else 2 ");
				}
			}
			else {
				System.out.println("Inner Else 1");
			}
		}
		else {
			System.out.println("Outer Else ");
		}
	}

}
