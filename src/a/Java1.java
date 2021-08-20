package a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java1{   
	public static void main( String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[.='Sign in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("identifierId")).sendKeys("balu.bharat39@gmail.com");

	}
	 
	}   