package progrmas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Locators {

	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      //driver.get("https://www.amazon.com/");
      //driver.manage().window().maximize();//to maximize the window
      //System.out.print(driver.getTitle());  //to see the title of the page
      //System.out.print(driver.getCurrentUrl());
      //System.out.print(driver.getPageSource());
      //driver.navigate().back();
      //driver.get("https://www.google.com/");
      //System.out.print(driver.getCurrentUrl());
      //driver.navigate().to("https://www.amazon.com/");
      //System.out.print(driver.getTitle());
      //driver.quit(); //Closes all browsers
      
      Actions a = new Actions(driver);
      a.moveToElement(driver.findElement(By.xpath("//div[.='Hello, Sign in']"))).click().perform();
      //driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("balu.bharat39@gmail.com");
      //driver.findElement(By.id("ap_email")).sendKeys("balu.bharat39@gmail.com");
      driver.findElement(By.name("email")).sendKeys("balu.bharat39@gmail.com");
      //driver.findElement(By.xpath("//input[@id='continue']")).click();
      driver.findElement(By.className("a-button-input")).click();
      driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("amazon@24");
      //driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
      //driver.findElement(By.cssSelector("#signInSubmit")).click();
      driver.findElement(By.cssSelector("input[id='signInSubmit']")).click();
	}

}
