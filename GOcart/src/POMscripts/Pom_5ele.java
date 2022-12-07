package POMscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_5ele {
	
	@FindBy(xpath="//a[@id='loginLink']") WebElement logbtn;
	
	@FindBy(xpath="//button[@id='web_continue_submit']") WebElement continu;
	
	@FindBy(xpath="//button[@id='web_email_login']") WebElement CemailBTN;
	
	@FindBy(xpath="//input[@id='email_input']") WebElement email;

	@FindBy(xpath="//input[@id='mob_password']") WebElement pass;
	
	@FindBy(xpath="//button[@id='mob_login_password_submit']") WebElement submit;

	
	//initialise
	
	public Pom_5ele (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	//utiise
	
	public void login() {
		// TODO Auto-generated method stub
		
		logbtn.click();

	}
	
	public void contbtn() {
		// TODO Auto-generated method stub
		
		continu.click();

	}
	
	public void mailbtn() {
		// TODO Auto-generated method stub
		
		CemailBTN.click();

	}
	
	public void mailtxt() {
		// TODO Auto-generated method stub
		
		email.sendKeys("manjurajumj@gmail.com");

	}
	
	public void pwd() {
		// TODO Auto-generated method stub
		
		pass.sendKeys("123456789");

	}
	
	public void enterbtn() {
		// TODO Auto-generated method stub
		
		submit.click();

	}
	


	

}
