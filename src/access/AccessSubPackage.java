package access;

import oops.AccessMain;

public class AccessSubPackage extends AccessMain{

	public static void main(String[] args) {
		AccessSubPackage subObject = new AccessSubPackage();
		
		//System.out.println(subObject.pvtStringVar);
		System.out.println(subObject.prctStringVar);
		//System.out.println(subObject.defaultStringVar);
		System.out.println(subObject.pubStringVar);
		
		AccessMain access = new AccessMain();
		
		//System.out.println(access.pvtStringVar);
		//System.out.println(access.prctStringVar);
		//System.out.println(access.defaultStringVar);
		System.out.println(access.pubStringVar);

	}

}
