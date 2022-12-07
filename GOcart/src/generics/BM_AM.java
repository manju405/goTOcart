package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BM_AM {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public  void BM() {
		
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		 driver=new FirefoxDriver();
		 
		 driver.get("https://www.bewakoof.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
	
	@AfterMethod
	public void AM() {
		
		driver.close();
	}

}
