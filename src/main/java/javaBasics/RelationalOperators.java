package javaBasics;

public class RelationalOperators {
	// Relational operators will return a boolean value 

	static int a = 10;
	static int b = 8;
	static int c = a;
	
	public static void main(String[] args) {

		// Equality use double '==' single '=' will only assign values 
		if(a==c) {
		System.out.println("a and c are equal "+ (a==c));
		}else {
		System.out.println("a and c are not equal ");
		}
		
		if(a==b) {
		System.out.println("a and b are equal ");
		}else {
		System.out.println("a and b are not equal "+ (a==b));
		}
		
		if(b!=c) {
		System.out.println("a and c are not equal "+ (b!=c));
		}else {
		System.out.println("a and b are not equal ");
		}
		
		if(a>b) {
			System.out.println("a is greater than b "+ (a>b));
			}else {
			System.out.println("a is not greater that b ");
			}
		
		if(a<b) {
		System.out.println("a is less than b "+ (a<b));
		}else {
		System.out.println("a is not less than b "+ (a<b));
		}
		
		// a is lesser than OR equal - a 10 c 10
		if(a<=c) {
			System.out.println("a is less than or equal to c "+ (a<=c));
			}else {
			System.out.println("a is not less than or equal to c "+ (a<=c));
			}
		
		// a is lesser than OR equal - a 10 c 11
		c=11;
		if(a<=c) {
			System.out.println("a is less than or equal to c "+ (a<=c));
			}else {
			System.out.println("a is not less than or equal to c "+ (a<=c));
			}
		// a is lesser than OR equal - a 10 c 9
		c=9;
		if(a<=c) {
			System.out.println("a is less than or equal to c "+ (a<=c));
			}else {
			System.out.println("a is not less than or equal to c "+ (a<=c));
			}

	}

}
