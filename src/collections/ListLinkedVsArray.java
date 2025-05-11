package collections;

import java.util.ArrayList;
import java.util.LinkedList;

//java.lang - default 

public class ListLinkedVsArray {
	
	ArrayList<Integer> arrayList = new ArrayList<>();
	LinkedList<Integer> linkedList = new LinkedList<>();
	
	double startTime;
	
	public void addList() {
		
		for(int i =0; i<=11299990; i++) {
			arrayList.add(i);
			linkedList.add(i);
		}
	}
	
	public void getMidValue() {
		
		startTime = System.currentTimeMillis();
		arrayList.get((arrayList.size())/2);
		System.out.println("Time taken for ArrayList to retreive a value from middle of the list "+ (System.currentTimeMillis() - startTime));
		
		startTime = System.currentTimeMillis();
		linkedList.get((linkedList.size())/2);
		System.out.println("Time taken for linkedList to retreive a value from middle of the list "+ (System.currentTimeMillis() - startTime));
		
	}
	
	public void getEndValue() {
		
		startTime = System.currentTimeMillis();
		arrayList.get((arrayList.size()-1));
		System.out.println("Time taken for ArrayList to retreive a value from end of the list "+ (System.currentTimeMillis() - startTime));
		
		startTime = System.currentTimeMillis();
		linkedList.get((linkedList.size()-1));
		System.out.println("Time taken for linkedList to retreive a value from end of the list "+ (System.currentTimeMillis() - startTime));
		
	}
	
	public void insertMidValue() {
		
		startTime = System.currentTimeMillis();
		arrayList.add((arrayList.size())/2,22223);
		System.out.println("Time taken for ArrayList to add a value in the mid of the list "+ (System.currentTimeMillis() - startTime));
		
		startTime = System.currentTimeMillis();
		linkedList.add((linkedList.size())/2,22223);
		System.out.println("Time taken for linkedList to add a value in the mid of the list "+ (System.currentTimeMillis() - startTime));
		
	}
	
	public void insertLastValue() {
		
		startTime = System.currentTimeMillis();
		arrayList.add((arrayList.size()-1), 999999);
		System.out.println("Time taken for ArrayList to add a value from end of the list "+ (System.currentTimeMillis() - startTime));
		
		startTime = System.currentTimeMillis();
		linkedList.add((linkedList.size()-1), 999999);
		System.out.println("Time taken for linkedList to add a value from end of the list "+ (System.currentTimeMillis() - startTime));
		
	}
	
public void removeMidValue() {
		
		startTime = System.currentTimeMillis();
		arrayList.remove((arrayList.size())/2);
		System.out.println("Time taken for ArrayList to remove a value in the mid of the list "+ (System.currentTimeMillis() - startTime));
		
		startTime = System.currentTimeMillis();
		linkedList.remove((linkedList.size())/2);
		System.out.println("Time taken for linkedList to remove a value in the mid of the list "+ (System.currentTimeMillis() - startTime));
		
	}

public void removeLastValue() {
	
	startTime = System.currentTimeMillis();
	arrayList.remove((arrayList.size()-1));
	System.out.println("Time taken for ArrayList to remove a value from last of the list "+ (System.currentTimeMillis() - startTime));
	
	startTime = System.currentTimeMillis();
	linkedList.remove((linkedList.size()-1));
	System.out.println("Time taken for linkedList to remove a value from last of the list "+ (System.currentTimeMillis() - startTime));
	
}

public void removeFirstValue() {
	
	startTime = System.currentTimeMillis();
	arrayList.remove(0);
	System.out.println("Time taken for ArrayList to remove First value in  the list "+ (System.currentTimeMillis() - startTime));
	
	startTime = System.currentTimeMillis();
	linkedList.remove(0);
	System.out.println("Time taken for linkedList to remove First value in  the list "+ (System.currentTimeMillis() - startTime));
	
}


	public static void main(String[] args) {
	
		ListLinkedVsArray object = new ListLinkedVsArray();
		object.addList();
		object.getMidValue();
		object.getEndValue();
		object.insertMidValue();
		object.insertLastValue();
		object.removeMidValue();
		object.removeLastValue();
		object.removeFirstValue();
		System.out.println(System.currentTimeMillis());
			
	}
	
	

}
