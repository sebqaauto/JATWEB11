package collections;

import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		int arr[] = {2,3,4,5,2,3,5,6,2,5,7,8,3};
		TreeMap<Integer, Integer> treeMap = new TreeMap<>();
		
		// Iterate through the array 
		for(int i=0; i<arr.length; i++) {
			
			// Check if the key is there in the map
			Integer existingKey = treeMap.get(arr[i]);
			
			//if the existingKey is null, then add it to the map and value should be set to 1
			if(treeMap.get(arr[i]) == null) {
				treeMap.put(arr[i], 1);
			}else {
				treeMap.put(arr[i], ++existingKey);
			}
			
		}
		
		for (Entry<Integer, Integer> temp : treeMap.entrySet()) {
			System.out.println(temp.getKey() + " -- "+ temp.getValue());
		}

	}

}
