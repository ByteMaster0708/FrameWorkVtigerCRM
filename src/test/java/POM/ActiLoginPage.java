package POM;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiLoginPage {

	
		
        public WebElement getUsernametf() {
		return usernametf;
	}

	public WebElement getPasswardtf() {
		return passwardtf;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getLogibbtn() {
		return logibbtn;
	}

		@FindBy(id="username")
		WebElement usernametf;
        
        @FindBy(name="pwd")
      		WebElement passwardtf;
        
        @FindBy(id="keepLoggedInCheckBox")
      		WebElement checkbox;
      		
      	  @FindBy(xpath="//div[text()='Login ']")
  		WebElement logibbtn;
		



}
