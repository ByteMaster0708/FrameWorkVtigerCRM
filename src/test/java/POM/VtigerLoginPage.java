package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VtigerLoginPage {
	
	
	
	@FindBy(id="username")
	WebElement untf;
	

	@FindBy(id="password")
	WebElement passtf;
	

	@FindBy(xpath="//button[text()='Sign in']")
	WebElement submittf;


	public WebElement getUntf() {
		return untf;
	}


	public WebElement getPasstf() {
		return passtf;
	}


	public WebElement getSubmittf() {
		return submittf;
	}
	
	
	

}
