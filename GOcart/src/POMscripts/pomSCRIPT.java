package POMscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class pomSCRIPT {
	
	@FindBy(xpath="//input[@placeholder='Enter Mobile Number']")
	private WebElement number;
	
	@FindBy(xpath="//button[.='Continue']")
	private WebElement btn;
	

	
	
	public  pomSCRIPT(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	
	}
	
	
	public void phoneno(String no) {
		// TODO Auto-generated method stub
		
		number.sendKeys(no);
		

	}
	
	
	public void btn() {
		// TODO Auto-generated method stub
		
		btn.click();;
		

	}
	
	



}
