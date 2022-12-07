package ft;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MajorDD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 

		
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.bewakoof.com/");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
	//mouse hover	
		WebElement Men = driver.findElement(By.xpath("(//span[@class='menuSelect'])[1]"));
		act.moveToElement(Men).perform();
		Thread.sleep(2000);
		
	//fetch all links and print 
		System.out.println("all the links present in mens DD ");
		
		List<WebElement> links = driver.findElements(By.xpath("(//div[@class=\"container menuDropdownWrpr\"])[1]"));
	//ArrayList<String>store=new ArrayList<String>();
		
		for(WebElement we:links) {
			System.out.println(we.getText());
		}
				
		System.out.println(" ...........................................................................");
		
	//check each link woking fine    
		 driver.findElement(By.xpath("(//span[.='Printed T-Shirts'])[1]")).click();
		 String title = driver.getTitle();
		 System.out.println(title);
		 if(title.contains("Printed")) {
			 System.out.println("FT case pass");
		 }
		 else {
			 System.out.println("FT case fail");

		 }
		

		WebElement Women = driver.findElement(By.xpath("(//span[@class='menuSelect'])[2]"));
		act.moveToElement(Women).perform();
		Thread.sleep(2000);

		
		WebElement mob = driver.findElement(By.xpath("(//span[@class='menuSelect'])[3]"));
		act.moveToElement(mob).perform();
		Thread.sleep(2000);


		
		
	}

}
