package collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapImplementationTest {

	public static void main(String[] args) {
		// Map Key and Value Map(Key,Value)  - Keys should unique
		// Student Roll No & Student Name - Sofia 2 | Sofia 3
		
		HashMap<Integer,String> hashMap = new HashMap<>();
		TreeMap<Integer,String> treeMap = new TreeMap<>();
		
		// Order is maintained ?
		
		hashMap.put(01, "Rahul");
		hashMap.put(02, "Sofia");
		hashMap.put(03, "Sofia");
		hashMap.put(17, "Dhoni");
		hashMap.put(55, "Raina");
		hashMap.put(40, "Yuvi");
		
		// Order is maintained ? Yes 
		treeMap.put(17, "Dhoni");
		treeMap.put(55, "Raina");
		treeMap.put(40, "Yuvi");
		treeMap.put(01, "Rahul");
		treeMap.put(02, "Sofia");
		treeMap.put(03, "Sofia");
		
		// entrySet() is a method which extracts the objects out of the map
		for (Entry<Integer, String> keyValuePairs : hashMap.entrySet() ) {
			
			System.out.println(keyValuePairs.getKey() + "--" + keyValuePairs.getValue());
		}
		
		for (Entry<Integer, String> object : treeMap.entrySet()) {
			System.out.println(object.getKey()+ " -- "+ object.getValue());
		}
	
		
	}

}
