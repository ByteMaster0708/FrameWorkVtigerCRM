package Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import POM.FBLoginPage;

public class FBLoginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		
		
		FBLoginPage FB = new FBLoginPage();
		
		PageFactory.initElements(d, FB);
		FB.getEmailtf().sendKeys("audumbar.daingade555@gmail.com");
		
		FB.getPasstf().sendKeys("Abd@1234");
		
		FB.getLoginbtn().click();

	}

}
