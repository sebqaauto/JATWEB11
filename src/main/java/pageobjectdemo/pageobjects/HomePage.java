package pageobjectdemo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
WebDriver driver;
	
	public HomePage(WebDriver deomWebShopDriver){
		this.driver = deomWebShopDriver;
		
	}
	
	public void addSpecificProduct(String productName) {
		String xPath = "//a[contains(text(),'"+productName+"')]/parent::h2/following-sibling::div[3]/div[2]/input";
		driver.findElement(By.xpath(xPath)).click();
		driver.findElement(By.cssSelector("div[class='overview'] input[value='Add to cart']")).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
	}
	
	public void goToShoppingCart() {
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	}
	
	
}
