package pageobjectdemo.tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pageobjectdemo.pageobjects.AmazonPage;


public class AmazonTestWithExtentReports {
	//Declaring the driver
	WebDriver driver;
	AmazonPage amz;

	//From Avenstack ExtentReports these 2 classes will help to create report
	ExtentSparkReporter sparkReporter;//writes the results in the html file 
	ExtentReports extent;// Will listen to each test and it needs to be attached with the ExtentSparkReporter
	ExtentTest test;
	
	public AmazonTestWithExtentReports() {
		sparkReporter = new ExtentSparkReporter("/Users/sebastianselvarajaugustine/eclipse-workspace/JavaTest/src/main/java/extent-results/Automationresults.html");
		sparkReporter.config().setReportName("Amazon Brand and Search Test");
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
	}
	public void launchChromeBrowser() {
		driver = new ChromeDriver();//GrandParent & GrandChild => ancestor relationship	
		amz = new AmazonPage(this.driver);
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();	
	}
	
	public void closeBrowser() {
		if(driver != null) {
			driver.quit();
		}	
	}
	
	public void runiPhoneSearchTest() throws IOException {
		test = extent.createTest("runiPhoneSearchTest");
		test.log(Status.INFO, "runiPhoneSearchTest started");
		amz.searchAndFindFirstProduct("iphone 15");
		String path = amz.takeSnap();
		test.addScreenCaptureFromPath(path);
		test.log(Status.PASS, "runiPhoneSearchTest ended");
		System.out.println("runiPhoneSearchTest Executed from " + Thread.currentThread().getName());
		extent.flush();
	}
	
	public void runSamsungSearchTest() throws IOException {
		test = extent.createTest("runSamsungSearchTest");
		test.log(Status.INFO, "runSamsungSearchTest started");
		amz.searchAndFindFirstProduct("samsung");
		String path = amz.takeSnap();
		test.addScreenCaptureFromPath(path);
		test.log(Status.PASS, "runSamsungSearchTest ended");
		System.out.println("runSamsungSearchTest Executed from " + Thread.currentThread().getName());
		extent.flush();
	}
	
	public void runMotorolaSearchTest() throws IOException {
		test = extent.createTest("runMotorolaSearchTest");
		test.log(Status.INFO, "runMotorolaSearchTest started");
		amz.searchAndFindFirstProduct("motorola");
		String path = amz.takeSnap();
		test.addScreenCaptureFromPath(path);
		test.log(Status.PASS, "runMotorolaSearchTest ended");
		System.out.println("runMotorolaSearchTest Executed from " + Thread.currentThread().getName());
		extent.flush();
	}
	
	
	String brandAndSearchTerm[][] = new String [][] {
		{"Sony", "sony bravia 55 inch"},//row 1
		{"Xiaomi", "Xiaomi pad 7 pro"},// row 2
		{"TCL", "tcl 55 inch tv"},// row 3
	};

	public void runSearchTestForSony(String brandAndSearchTerm[][]) throws IOException {
		test = extent.createTest("runSearchTestForSony");
		test.log(Status.INFO, "runSearchTestForSony started");
		amz.searchAndFindFirstProduct(brandAndSearchTerm[0][1]);
		amz.validateBrandInfoInPageTitle(brandAndSearchTerm[0][0]);
		String path = amz.takeSnap();
		test.addScreenCaptureFromPath(path);
		test.log(Status.PASS, "runSearchTestForSony ended");
		extent.flush();
	}
	
	public void runSearchTestForXiaomi(String brandAndSearchTerm[][]) throws IOException {
		test = extent.createTest("runSearchTestForXiaomi");
		test.log(Status.INFO, "runSearchTestForXiaomi started");
		amz.searchAndFindFirstProduct(brandAndSearchTerm[1][1]);
		amz.validateBrandInfoInPageTitle(brandAndSearchTerm[1][0]);
		String path = amz.takeSnap();
		test.addScreenCaptureFromPath(path);
		test.log(Status.PASS, "runSearchTestForXiaomi ended");
		extent.flush();
	}
	
	public void runSearchTestForTCL(String brandAndSearchTerm[][]) throws IOException {
		test = extent.createTest("runSearchTestForTCL");
		test.log(Status.INFO, "runSearchTestForTCL started");
		amz.searchAndFindFirstProduct(brandAndSearchTerm[2][1]);
		amz.validateBrandInfoInPageTitle(brandAndSearchTerm[2][0]);
		String path = amz.takeSnap();
		test.addScreenCaptureFromPath(path);
		test.log(Status.PASS, "runSearchTestForTCL ended");
		extent.flush();
	}
	
	public static void main(String a[]) throws IOException {
		AmazonTestWithExtentReports test = new AmazonTestWithExtentReports();
		test.launchChromeBrowser();
		test.runiPhoneSearchTest();
		test.runMotorolaSearchTest();
		test.runSamsungSearchTest();
		test.runSearchTestForSony(test.brandAndSearchTerm);
		test.runSearchTestForTCL(test.brandAndSearchTerm);
		test.runSearchTestForXiaomi(test.brandAndSearchTerm);
		test.closeBrowser();
	
	}
	

}
