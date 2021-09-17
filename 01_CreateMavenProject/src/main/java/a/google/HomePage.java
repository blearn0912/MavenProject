package a.google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public SearchPage searchGoogle(String inputKey) {
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(inputKey + Keys.ENTER);
		System.out.println(inputKey + " is successfully searched");
		return new SearchPage(driver);
	}

}
