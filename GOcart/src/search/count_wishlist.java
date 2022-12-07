package search;

import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class count_wishlist {

	@Test
	
	public static void count() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//impicitly wait
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//explicit wait 
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		

		driver.get("https://www.bewakoof.com/");
		
//login		
		WebElement login = driver.findElement(By.xpath("//a[.='Login']"));
			login.click();
			Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[.=' CONTINUE WITH EMAIL']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email_input']")).sendKeys("manjurajumj@gmail.com");
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='mob_password']"));
		Thread.sleep(2000);
		
		pass.sendKeys("test12345");
		Thread.sleep(2000);
		
		pass.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.titleContains("Online"));
		
		String tlt = driver.getTitle();
		Thread.sleep(2000);
		
		System.out.println(tlt);
		
		
	//MAJOR TAB		
		Actions act=new Actions(driver);
		
			WebElement Men = driver.findElement(By.xpath("(//span[@class='menuSelect'])[1]"));
			Thread.sleep(2000);	
			wait.until(ExpectedConditions.titleContains("Online"));
		act.moveToElement(Men).perform();
		
		
		driver.findElement(By.xpath("(//span[.='Printed T-Shirts'])[1]")).click();
		Thread.sleep(5000);
	
		
		//cick		
	    List<WebElement> wishic = driver.findElements(By.xpath("(//div[@class='productCardDetail   '])/div[1]/div[2]"));
		Thread.sleep(2000);
		
		int count = wishic.size();
		System.out.println(count);
		
	
		
	//click 
		WebElement wishic1 = driver.findElement(By.xpath("(//div[@class='productCardDetail   '])[1]/div[1]/div[2]"));
		wishic1.click();
		Thread.sleep(5000);
		
		wishic1 = driver.findElement(By.xpath("(//div[@class='productCardDetail   '])[2]/div[1]/div[2]"));
		wishic1.click();
		Thread.sleep(5000);
		
		wishic1 = driver.findElement(By.xpath("(//div[@class='productCardDetail   '])[3]/div[1]/div[2]"));
		wishic1.click();
		Thread.sleep(5000);
		
		
		
	//count in wishlist	
		 driver.findElement(By.xpath("//i[@class='icon_wishlist_filled']")).click();
			
		
			 List<WebElement> product = driver.findElements(By.xpath("//div[@class='productName']"));
			int actual = product.size();
			
			if(actual==10) {
				System.out.println("pass");
			}
			
			else {
				System.out.println("fail");
			}
			
			
	//logout 
		WebElement loc = driver.findElement(By.xpath("(//div[@class='actionMenu']//a)[2]"));
		Thread.sleep(2000);
		
		act.moveToElement(loc).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		




	}

}
