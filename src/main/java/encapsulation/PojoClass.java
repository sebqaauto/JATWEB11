package encapsulation;

public class PojoClass {
	
	private String companyName;
	private String cityName;
	
	// Setter methods are used to set the private members value
	
	public void setValues(String company, String city) {
		companyName = company;
		cityName = city;
	}
	
	// getter methods are used to get the private members value outside the class
	
	public String getCompanyName() {
		return companyName;
	}
	
	public String getCityName() {
		return cityName;
	}


}
