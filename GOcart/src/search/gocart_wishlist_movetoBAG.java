package search;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class gocart_wishlist_movetoBAG {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.bewakoof.com/");
		Thread.sleep(2000);
//login		
		WebElement login = driver.findElement(By.xpath("//a[.='Login']"));
				login.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[.=' CONTINUE WITH EMAIL']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email_input']")).sendKeys("manjurajumj@gmail.com");
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.xpath("//input[@id='mob_password']"));
		
		pass.sendKeys("test12345");
		Thread.sleep(5000);
		
		pass.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

//GOto WISHLIST		
		driver.findElement(By.xpath("//i[@class='icon_wishlist_filled']")).click();
		Thread.sleep(2000);
		
//MOVE TO BAG
		
		
		driver.findElement(By.xpath("(//button[.='MOVE TO BAG'])[1]")).click();
		Thread.sleep(2000);
			
		 WebElement dd = driver.findElement(By.xpath("//select[@class='dropDown']"));	
		Thread.sleep(2000);

		Select ele=new Select(dd);
		
		dd.click();
		Thread.sleep(3000);

		ele.selectByIndex(1);
		
//check in bag 
		driver.findElement(By.xpath("//span[@id='testHeaderCart']")).click();
		Thread.sleep(8000);
		
		String Op = driver.findElement(By.xpath("//a[@class='cartProductName']")).getText();
		
		if(Op.contains("Kamado")) {
			System.out.println("Testing scenario pass");
		}
		
		else {
			System.out.println("Testing scenario failed");

		}
		
	//logout 
		WebElement loc = driver.findElement(By.xpath("(//div[@class='actionMenu']//a)[3]"));
		
		Actions act=new Actions(driver);

		act.moveToElement(loc).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		

		

	}

}
