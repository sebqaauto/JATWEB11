package javaBasics;
// In Java multiple classes can exist as part of the same class
// But only one class can have the access modifier public 
class Home{
	
	// Consider each room as a class
	// Nested Class are possible in Java 
	
	FatherRoom getFatherRoomKey(){
		return new FatherRoom();
	}
	
	class FatherRoom{
		
		public void openFatherDraw() {
			System.out.println("Father draw is opened");
		}
	}
	
	MotherRoom motherKey(){
		return new MotherRoom();
	}
	
	class MotherRoom{
		public void openMotherDraw() {
			System.out.println("Mother draw is opened");
		}
	}
	
}


public class Main {

	class SubMain{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Home home = new Home();
		//chaining of methods 
		home.getFatherRoomKey().openFatherDraw();
		home.motherKey().openMotherDraw();
		
	}

}
