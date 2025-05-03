package encapsulation;

public class RetrevialClass extends PojoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PojoClass pojo = new PojoClass();
		
		pojo.setValues("L&T", "Mumbai");
		System.out.println(pojo.getCompanyName());
		System.out.println(pojo.getCityName());
	}

}
