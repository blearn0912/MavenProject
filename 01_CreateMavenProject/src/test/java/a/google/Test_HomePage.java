package a.google;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Test_HomePage {
	
	WebDriver driver;
	String baseurl = "https://www.google.com";
	HomePage homepage;
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(baseurl);
  }

  
  @Test
  public void homePageTest() {
	  homepage = new HomePage(driver);
	  System.out.println("HomePage Title is: " + homepage.getPageTitle());
	  String searchPageTitle = homepage.searchGoogle("Learn Java").getPageTitle();
	  System.out.println("SearchPage Title is:  " + searchPageTitle);	  
  }
  
   
  @AfterClass
  public void afterClass() {
	  //driver.quit();
  }

}
