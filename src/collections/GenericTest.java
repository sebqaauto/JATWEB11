package collections;

public class GenericTest <T> {
	
	// T refers generic type
	T objectT;
	
	public GenericTest(T object) {
		this.objectT = object;
	}
	
	public T getValue() {
		return objectT;
	}
	
	public static void main(String[] args) {
	
		// Generic is giving you type safety 
		GenericTest<Integer> intObj = new GenericTest<Integer>(100);
		GenericTest<Float> floatObj = new GenericTest<Float>(3.14f);
		GenericTest<String> strObj = new GenericTest<String>("Type String");

		int intVar = intObj.getValue();
		float floatVar = floatObj.getValue();
		String str = strObj.getValue();
		
		System.out.println(intVar);
		System.out.println(floatVar);
		System.out.println(str);
	}

}
