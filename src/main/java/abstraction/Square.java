package abstraction;

// Can't extend more than 1 class, can implement more than 1 interface 
public class Square implements Shape, Angles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		return  (float) (2.3 * 2.3);
	}

	@Override
	public String setColour() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public void setAngles() {
		System.out.println("All angles are right angles in a square");
		
	}

}
