package collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapTest2 {

	public static void main(String[] args) {
		
		
		
		HashMap<String,String> hashMap = new HashMap<>();
		TreeMap<String,String> treeMap = new TreeMap<>();
		
		// Order is maintained ?
		
		hashMap.put("CSE", "Rahul");
		hashMap.put("MECH", "Sofia");
		hashMap.put("ECE", "Sofia");
		hashMap.put("EEE", "Dhoni");
		hashMap.put("B.Tech IT", null);
		hashMap.put("ARCH", null);
		// HashMap accepts only one Key to be null 
		hashMap.put(null, "Virat");
		hashMap.put(null, "Pant");
		
		// Order is maintained ? Yes  
		treeMap.put("CSE", "Rahul");
		treeMap.put("MECH", "Sofia");
		treeMap.put("ECE", "Sofia");
		treeMap.put("EEE", "Dhoni");
		treeMap.put("B.Tech IT", "Raina");
		treeMap.put("ARCH", "Yuvi");
		treeMap.put("CIVIL", null);
		//treeMap.put(null, "Virat"); 
		// Treemap doesn't allow null as Key becomes it cannot sort the null key
		
		
		for (Entry<String, String> temp : hashMap.entrySet()) {
			System.out.println(temp.getKey() + "--"+ temp.getValue());
		}
		System.out.println(" --------------");
		System.out.println(" --------------");
		for (Entry<String, String> temp : treeMap.entrySet()) {
			System.out.println(temp.getKey() + "--"+ temp.getValue());
		}

	}

}
