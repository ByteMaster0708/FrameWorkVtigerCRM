package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FileInputStream fl = new FileInputStream("src\\test\\resources\\Data.properties");
		
		Properties pr = new Properties();
	pr.load(fl);
	
	String url = pr.getProperty("url");
	String un = pr.getProperty("username");
	String pss = pr.getProperty("passward");
	
	d.get(url);
	d.findElement(By.id("username")).sendKeys(un);
	d.findElement(By.name("pwd")).sendKeys(pss);
	}

}
