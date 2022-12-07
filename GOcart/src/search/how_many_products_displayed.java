package search;

import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


// check how many products displayed and check details,price,wishlist is displayed in each product

public class how_many_products_displayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String input="pants";

		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.bewakoof.com/");
		Thread.sleep(2000);
		
      WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search by product, category or collection']"));
		
		search.sendKeys(input);
		Thread.sleep(2000);

		search.sendKeys(Keys.ENTER);
		Thread.sleep(10000);
	
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='productCardDetail   ']"));
		Thread.sleep(2000);
		
		
		
		ArrayList<String>details=new ArrayList<String>();
	
		for(WebElement s:products) {
			String det = s.getText();
			details.add(det);
		
		}
		System.out.println(details.size());

int i=1;
       for(String x:details) {
        	System.out.println(i+"st product details: ");
           System.out.println(x);
           i++;
 
        }
		
	/*//wishlist
		WebElement wish = driver.findElement(By.xpath("(//img[@class='productImgTag'])[1]/../../following-sibling::div/div[1]/div[2]"));
		if(wish.isDisplayed()) {
			if(wish.isEnabled()) {
				System.out.println("icon is enabled");
			}
			else {
				System.out.println("not enabled");
			}
		}
		else {
			System.out.println("not displayed");
		}
		
		
		
		driver.quit();*/
		
		
		
		
	
		
	}

}
