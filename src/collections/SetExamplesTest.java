package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetExamplesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hashSet = new HashSet<>();
		HashSet<String> hashSet2 = new HashSet<>();
		TreeSet<String> treeSet = new TreeSet<>();
		
		hashSet2.add("Sun");
		hashSet2.add("Moon");
		hashSet2.add("Star");
		
		// HashSet will not maintain Order
		
		hashSet.add("Alpha");
		hashSet.add("Gamma");
		hashSet.add("Beta");
		hashSet.add("Theta");
		hashSet.add("Beta"); // duplicates are not allowed 
		hashSet.add("Gamma"); // duplicates are not allowed 
		hashSet.add(null);
		hashSet.addAll(hashSet2);
		
		
		// TreeSet will maintain Order
		treeSet.add("Zeta");
		treeSet.add("Gamma");
		treeSet.add("Beta");
		treeSet.add("Theta");
		treeSet.add("Beta");
		treeSet.add("Gamma");
		treeSet.add("Alpha");
		//treeSet.add(null);
		
// To traverse through the collection object - use 1) Iterator 2) For each loop
		
		Iterator<String> iterator = hashSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+"---");
		}
		System.out.println();
		System.out.println("----------------------------");
		System.out.println("----------------------------");
		iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+"---");
		}
		
		
		if(hashSet.contains("Moon")) {
			System.out.println("Yes Moon exists in hashSet");
		}
		
		if(hashSet.containsAll(hashSet2)) {
			System.out.println("Yes Sun, Moon and Star exists in hashSet");
		}
		
		System.out.println(treeSet.pollFirst());
		System.out.println(iterator.hasNext());
		
		iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+"---");
		}

	}

}
