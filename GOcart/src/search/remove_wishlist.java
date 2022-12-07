package search;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class remove_wishlist {

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
		
	
				
//remove in wishlist	
				driver.findElement(By.xpath("//i[@class='icon_wishlist_filled']")).click();
				Thread.sleep(2000);
				
				List<WebElement> loc = driver.findElements(By.xpath("//i[@class='icon_close icon_close']"));
				System.out.println("items present in wishlist:"+loc.size());
				/*for(WebElement remove:loc) {
					remove.click();
					Thread.sleep(2000);

				}*/
				driver.findElement(By.xpath("(//i[@class='icon_close icon_close'])[2]")).click();
				Thread.sleep(2000);

//check
				driver.findElement(By.xpath("//i[@class='icon_wishlist_filled']")).click();
				Thread.sleep(2000);
				
				List<WebElement> neww = driver.findElements(By.xpath("//i[@class='icon_close icon_close']"));
				
				System.out.println("items present in wishlist after reoval:"+neww.size());

					
	}

}
