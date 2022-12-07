package search;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class wishlist {

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
		
	//search
		
		String input="shirts";
		 WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search by product, category or collection']"));
			
			search.sendKeys(input);
			Thread.sleep(5000);

			search.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
	
//click on wish		
		WebElement wishic = driver.findElement(By.xpath("(//div[@class='productCardDetail   '])[10]/div[1]/div[2]"));
		wishic.click();
		Thread.sleep(5000);

//check	
			 driver.findElement(By.xpath("//i[@class='icon_wishlist_filled']")).click();
			Thread.sleep(2000);
		
			String product = driver.findElement(By.xpath("//div[@class='productName']")).getText();
			System.out.println(product);
			
			if(product.contains("Shirt")) {
				System.out.println("product is displayed");
			}
			
			else {
				System.out.println("product is not displayed");
			}
			
			
/*//logout
 
		WebElement logout = driver.findElement(By.xpath(""));		
		Actions act=new Actions(driver);
		act.moveToElement(logout).perform();
		driver.findElement(By.xpath("")).click();
		
		*/
		
		

	}
	

}
