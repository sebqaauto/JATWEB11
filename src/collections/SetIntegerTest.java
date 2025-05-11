package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetIntegerTest {

	public static void main(String[] args) {
		
		HashSet<Integer> hashSet = new HashSet<>();
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		
		hashSet.add(100);
		hashSet.add(21);
		hashSet.add(303);
		hashSet.add(41);
		hashSet.add(15);
		
		
		treeSet.add(100);
		treeSet.add(22);
		treeSet.add(13);
		treeSet.add(4);
		treeSet.add(505);
		
		Iterator<Integer> itereator = hashSet.iterator();
		
		while(itereator.hasNext()) {
			System.out.print(itereator.next()+" --- ");
		}
		
		System.out.println();
		itereator = treeSet.iterator();
		
		while(itereator.hasNext()) {
			System.out.print(itereator.next()+ " --- " );
		}
	}

}
