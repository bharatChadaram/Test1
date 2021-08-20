package a;

import org.openqa.selenium.By;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://bharat//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);
		WebElement move= driver.findElement(By.xpath("//div[.='Hello, Sign in']"));
		a.moveToElement(move).click().perform();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("balu.bharat39@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("amazon@24");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus");
		driver.findElement(By.id("nav-search-submit-text")).click();
		//driver.findElement(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']/div[2]/div/span/div/div/div[2]/div[2]/div/div/div/div/div/h2/a")).click();
		driver.findElement(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']/div[2]/div/span/div/div/div[2]/div[2]/div/div/div/div/div/h2/a/span")).click();
		//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Iphone").build().perform();
		
		//moves to specific element
		//driver.quit();
		
	}

}
