package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FBLoginPage {
	
	@FindBy(id="email")
	WebElement Emailtf;
	
	public WebElement getEmailtf() {
		return Emailtf;
	}

	public WebElement getPasstf() {
		return Passtf;
	}

	public WebElement getLoginbtn() {
		return Loginbtn;
	}

	@FindBy(id="pass")
	WebElement Passtf;
	
	@FindBy(name="login")
	WebElement Loginbtn;
	
	

}
