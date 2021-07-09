package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	
  @Test
  public void f() throws InterruptedException {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");

	//Initiating your chromedriver
	WebDriver driver=new ChromeDriver();

	//Applied wait time
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//maximize window
	driver.manage().window().maximize();

	//open browser with desried URL
	driver.get("https://www.abercrombie.com");

	Thread.sleep(5000);

	//closing the browser
	driver.close();
	  
	  
  }
}
