package collections;

import java.util.ArrayList;
import java.util.ListIterator;


public class ListIteratorTest {

	
	
	public static void main(String[] args) {
	
		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("Mercury");
		stringList.add("Mars");
		stringList.add("Earth");
		stringList.add("Venus");
		stringList.add("Jupiter");
		
	ListIterator<String> listIterator = stringList.listIterator();
	while(listIterator.hasNext()) {
		
		String str = listIterator.next();
		if(str.equals("Earth")) {
			listIterator.set("Planet Earth");
		}
		System.out.print(str+" --- ");
	}
	System.out.println();
	while(listIterator.hasPrevious()) {
		System.out.print(listIterator.previous()+" --- ");
	}
		

	}

}
