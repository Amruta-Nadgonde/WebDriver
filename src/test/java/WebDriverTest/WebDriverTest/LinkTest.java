package WebDriverTest.WebDriverTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class LinkTest {
	WebDriver driver;
  @Test
  public void testLinks() {
	  try
	  {
		  WebElement gmail = driver.findElement(By.linkText("Gmail"));
		  
	  }
	  catch (NoSuchElementException e)
	  {
		  e.printStackTrace();
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.google.co.in/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
