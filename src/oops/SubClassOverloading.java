package oops;

public class SubClassOverloading extends OverloadingTest{
	
	public float add(float a, float b) {
		return a+b;
	}
	
	public String add(String a, String b) {
		return a+b;
	}
	
	public String input = "Malayalam";
	String reverse="";
	public void findPalindrome() {
		input = input.toLowerCase();
		System.out.println(input);
		for(int i =input.length()-1 ; i>=0 ; i--) {
			reverse = reverse+input.charAt(i);
		}
		System.out.println(reverse);
		if(input.equals(reverse)) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
	}
	
	public void doSomething() {
		
	}
	
	//public abstract void doSomeOtherthing();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubClassOverloading child = new SubClassOverloading();
		System.out.println(child.add(4.5f, 5.6f, 6.5f));
		System.out.println(child.add("Mon", "day"));
		child.findPalindrome();
		
	}

}
