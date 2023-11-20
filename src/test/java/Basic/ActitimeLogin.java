package Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import POM.ActiLoginPage;

public class ActitimeLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://demo.actitime.com/login.do");
		
		ActiLoginPage actilogin = new ActiLoginPage();
		PageFactory.initElements(d, actilogin);
		actilogin.getUsernametf().sendKeys("admin");
		actilogin.getPasswardtf().sendKeys("manager");
		actilogin.getCheckbox().click();
		actilogin.getLogibbtn().click();

	}
	

}
