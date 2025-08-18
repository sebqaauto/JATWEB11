package pageobjectdemo.tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class MyTestListener implements ITestListener{
DemoWebShopTestNG demo = new DemoWebShopTestNG();
	
@Override
public void onStart(ITestContext context) {
System.out.println("Test Suite started: " + context.getName());
}

@Override
public void onFinish(ITestContext context) {
System.out.println("Test Suite finished: " + context.getName());
}

@Override
public void onTestStart(ITestResult result) {
System.out.println("Test method started: " + result.getName());
}

@Override
public void onTestSuccess(ITestResult result) {
System.out.println("Test method passed: " + result.getName());
}

@Override
public void onTestFailure(ITestResult result) {
System.out.println("Test method failed: " + result.getName());
try {
	demo.takeSnap();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}

@Override
public void onTestSkipped(ITestResult result) {
System.out.println("Test method skipped: " + result.getName());
}


}
