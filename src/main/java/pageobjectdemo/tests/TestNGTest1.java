package pageobjectdemo.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class TestNGTest1 {

	
	@Test(groups ="smoke")//priority =3
	public void firstTest() {
		System.out.println("Running from TestNGTest1 this firstTest");
	}
	
	@Test(groups ="regression", dependsOnGroups ="smoke", alwaysRun = true)//priority =2
	public void secondTest() {
		System.out.println("Running from TestNGTest1 this secondTest");
	}
	
	@Test(groups ={"regression", "smoke", "e2e"}, invocationCount =3)//priority =1
	public void thirdTest() {
		System.out.println("Running from TestNGTest1 this thirdTest");
	}
	@BeforeMethod
	public void runBeforeMethod() {
		System.out.println("Running from TestNGTest1 this runBeforeMethod");
	}
	
	@AfterMethod
	public void runAfterMethod() {
		System.out.println("Running from TestNGTest1 this runAfterMethod");
	}
	
	@BeforeClass
	public void runBeforeClass() {
		System.out.println("Class runBeforeClass started");
	}
	
	@AfterClass
	public void runAfterClass() {
		System.out.println("Class runAfterClass ended");
	}
	@BeforeTest
	public void runBeforeTest() {
		System.out.println("Test is started ");
	}
	
	@AfterTest
	public void runAfterTest() {
		System.out.println("Test has ended ");
	}
	
	
	@BeforeSuite
	public void runBeforeSuite() {
		System.out.println("Suite is started ");
	}
	
	@AfterSuite
	public void runAfterSuite() {
		System.out.println("Suite has ended ");
	}
	


}
