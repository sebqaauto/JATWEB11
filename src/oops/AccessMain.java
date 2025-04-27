package oops;

public class AccessMain {
	
	private String pvtStringVar ="Private Access";
	protected String prctStringVar ="Protected Access";
	String defaultStringVar ="Default Access";
	public String pubStringVar ="Public Access";
	

	public static void main(String[] args) {
	
		AccessMain access = new AccessMain();
		System.out.println(access.pvtStringVar);
		System.out.println(access.prctStringVar);
		System.out.println(access.defaultStringVar);
		System.out.println(access.pubStringVar);
		
	}

}
