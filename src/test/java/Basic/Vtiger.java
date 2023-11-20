
package Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import POM.VtigerLoginPage;

public class Vtiger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://demo.vtiger.com/vtigercrm/");
		
		
		VtigerLoginPage vt = new VtigerLoginPage();
		
		PageFactory.initElements(d, vt);
		vt.getUntf().sendKeys("admin");
		vt.getPasstf().sendKeys("admin");
		
		vt.getSubmittf().click();

	}

}
