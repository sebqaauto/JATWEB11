package javaBasics;

public class BreakContinueTest {
	
	
	public static void doSomeLogic() {
		
		for(int i=1; i<=30; i++) {
			if(i%2==0) {
			//Skip the current loop iteration and continues to the next iteration 
				continue;
			}else if(i%2!=0) {
				System.out.println("The number is "+i);
			}
			System.out.println("From the for Loop iteration number is "+i);
			
			
//			 if(i%3==0 && i%5==0) {
//					System.out.println("The number is "+(i*3));
//			}else if(i==27) {
//				break;
//			}
			 
		}
	}

	public static void main(String[] args) {
		
		doSomeLogic();
		
	}

}
