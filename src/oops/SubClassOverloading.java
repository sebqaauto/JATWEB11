package oops;

public class SubClassOverloading extends OverloadingTest{
	
	public float add(float a, float b) {
		return a+b;
	}
	
	public String add(String a, String b) {
		return a+b;
	}
	
	public String input = "Malayalam";
	
	public void findPalindrome() {
		input = input.toLowerCase();
		char [] arr = input.toCharArray();
		char [] revArr = new char[arr.length];
		int counter = 0;
		for(int i =arr.length-1; i>=0; i-- ) {
			revArr[counter] = arr[i];
			counter++;
		}
		
		for (char c : revArr) {
			System.out.print(c);
		}
		for (char c : arr) {
			System.out.print(c);
		}
		
		if(arr.equals(revArr)) {
			System.out.println("It is a palindrome");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubClassOverloading child = new SubClassOverloading();
		System.out.println(child.add(4.5f, 5.6f, 6.5f));
		System.out.println(child.add("Mon", "day"));
		child.findPalindrome();
		
	}

}
