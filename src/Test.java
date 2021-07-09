import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	
public static void main() throws InterruptedException {
// TODO Auto-generated method stub

//setting the driver executable
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