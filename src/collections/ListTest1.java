package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map.Entry;


public class ListTest1 {

	/*/
	 *  ArrayList can grow dynamically so array size will not be a problem 
	 */
	
	public static void main(String[] args) {
	
		// Traditional array has a limitation with size
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		intArrayList.add(10);
		intArrayList.add(12);
		intArrayList.add(14);
		intArrayList.add(16);
		intArrayList.add(18);
		intArrayList.add(20);
		intArrayList.add(22);
		
		Iterator<Integer> iterator = intArrayList.iterator();
		// It iterates over any Collection object - hasNext() which checks for presence of objects(values)
		// it also has next() which retreives the next value
		System.out.println("From the Iterator ");
		while(iterator.hasNext()) {
			int c = iterator.next();
			if( c == 22) {
				iterator.remove();
			}else {
				System.out.print(c+ "---");
			}
		}
		System.out.println();
		System.out.println("Size of intArrayList is --"+intArrayList.size());
		
		ArrayList<Integer> intArrayList2 = new ArrayList<Integer>(10);
		for(int i=0; i<=20; i++) {
			intArrayList2.add(i);
		}
		
		iterator = intArrayList2.iterator();
		iterator.next();
		iterator.next();
	
		while(iterator.hasNext()) {
			
			System.out.print(iterator.next()+"---");
		}
		
		//intArrayList.add(10.5f);// type safety 
		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("Hello");
		
		ArrayList<Double> doubleList = new ArrayList<>();
		doubleList.add(34.78d);
		
		for (Integer temp : intArrayList2) {
			System.out.println(temp);
		}
		
		System.out.println(intArrayList.get(0));
		System.out.println(stringList.get(0));
		System.out.println(doubleList.get(0));
		
		// Using addAll() add a collection in to another collection 
 		intArrayList2.addAll(intArrayList);
 		intArrayList2.add(0, 100);
 		
		System.out.println("After adding the collection ");
		
		for (Integer temp : intArrayList2) {
			System.out.println(temp);
		}
		
		System.out.println("Size of the array "+intArrayList2.size());

	}

}
