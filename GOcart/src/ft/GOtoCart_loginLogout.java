package ft;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GOtoCart_loginLogout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.bewakoof.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[.='Login']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[.=' CONTINUE WITH EMAIL']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email_input']")).sendKeys("manjurajumj@gmail.com");
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.xpath("//input[@id='mob_password']"));
		
		pass.sendKeys("test12345");
		Thread.sleep(2000);
		
		pass.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		/*
		
		
		add wrt need .......................
		
		*/
		
	//log out
		Actions act=new Actions(driver);
        WebElement loc = driver.findElement(By.xpath("(//div[@class='actionMenu']//a)[2]"));
		
		act.moveToElement(loc).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		


		



	}

}
