package search;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class search_shirts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String input="shirts";
		
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.bewakoof.com/");
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search by product, category or collection']"));
		
		search.sendKeys(input);
		Thread.sleep(2000);

		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		String check =driver.getTitle();
		System.out.println(check);
		
		if(check.contains(input)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		

	}

}
