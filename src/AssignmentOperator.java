
public class AssignmentOperator {

	// Variables 
	static int a = 10;
	static int b = 8;
	static int c = 9;
	static int d = 7;
	static int e = 2;
	static int f = 3;
	
	// Constant - its fixed its value can't be changed 
	
	public static void main(String[] args) {
		// re assigning a new value 
		//a = a+5;
		a += 5;
		System.out.println("The re assigned value 1 of a is "+a); // 15
		a = b+c;
		System.out.println("The re assigned value 2 of a is "+a); // 17
		a = a + b - c;
		System.out.println("The re assigned value 3 of a is "+a); // 16
		// a = a -6;
		a -= 6;
		System.out.println("The re assigned value 4 of a is "+a); // 10
		a *= 8;
		System.out.println("The re assigned value 5 of a is "+a); // 80
		
		// b = 8 
		// System.out.println("The re assigned value of b is "+ (b++ + ++b)); // 10 0r 9 
		
		System.out.println("The re assigned value of b is "+ (b++)); // 8 post increment will first use the current value and after that b is incremented by 1
		
		System.out.println("The re assigned value of b is "+ (b));//
		
		// c = 9
		
		System.out.println("The re assigned value of b is "+ (++b)); //  pre increment will first increase the value by 1 and then use 
		
		System.out.println("The re assigned value of b is "+ (b));//
		
		// d = 7 
		System.out.println("The re assigned value of d is "+ (++d + d++)); // d's value is 8  and output is 16  - 8 + 8 = 16 => d => 9
		
		System.out.println("The re assigned value of d is "+ (d));// 9
		
		// e = 2 
		
		System.out.println("The re assigned value of e is "+ (e++ + e++ + e++ - --e));
		// 2 + 3 + 4 - 4
		System.out.println("The re assigned value of e is "+ e); //4
		
		// e++  => e=e+1 e-- = e= e-1
		
		// f=3
		System.out.println("The re assigned value of f is "+ (++f + f++ + f++ + --f));
		// 4 + 4 + 5 + 5
		System.out.println("The re assigned value of f is "+ f);

	}

}
