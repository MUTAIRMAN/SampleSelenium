import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestingGoogle {

	
	public static void main  (String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	


 System.setProperty("webdriver.gecko.driver","C:\\Users\\Muthukumar\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
 WebDriver driver = new FirefoxDriver(); 
		Thread.sleep(10000);
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		driver.findElement(By.id("lst-ib")).sendKeys("Muthukumar");
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
