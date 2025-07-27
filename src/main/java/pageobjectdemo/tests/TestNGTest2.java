package pageobjectdemo.tests;

import org.testng.annotations.*;

public class TestNGTest2 {
	
	@Test(groups ="regression", dependsOnMethods ={"appTest2","appTest3"}, alwaysRun= true)
	public void appTest1() {
		System.out.println("From TestNGTest2 appTest1 method");
	}
	
	@Test(enabled = true, groups ="smoke")
	public void appTest2() {
		System.out.println("From TestNGTest2 appTest2 method");
		throw new ArithmeticException();
	}
	
	@Test(enabled = true, groups ="smoke")
	public void appTest3() {
		System.out.println("From TestNGTest2 appTest3 method");
	}


}
