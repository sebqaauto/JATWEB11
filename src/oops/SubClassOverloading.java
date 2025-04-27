package oops;

public class SubClassOverloading extends OverloadingTest{
	
	public float add(float a, float b) {
		return a+b;
	}
	
	public String add(String a, String b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubClassOverloading child = new SubClassOverloading();
		System.out.println(child.add(4.5f, 5.6f, 6.5f));
		System.out.println(child.add("Mon", "day"));
		
	}

}
