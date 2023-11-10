package Actions1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://www.google.com/");
		//1st of all should create  source and destination variable by finding element
		WebElement googleapps = d.findElement(By.xpath("//a[@class='gb_d']"));	
		
		Actions a = new Actions(d);
		a.click(googleapps);
		a.perform();
		d.switchTo().frame("app");
		Thread.sleep(2000);
		
//		WebElement playstore=d.findElement(By.xpath("//span[@style='background-position: 0 -290px;']"));
//		a.click(playstore);
//		a.perform();
		
		d.switchTo().frame("app");
		Thread.sleep(2000);
	WebElement utube = d.findElement(By.xpath("//span[@style='background-position: 0 -2378px;']"));
	a.click(utube);
	a.perform();
	}

}
