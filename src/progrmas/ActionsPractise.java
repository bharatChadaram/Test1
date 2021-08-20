package progrmas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractise 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C://Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement hover = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		a.moveToElement(hover).click().perform();
		//driver.findElement(By.xpath("//span[.='Sign in']")).click();
		driver.findElement(By.id("ap_email")).sendKeys("balu.bharat39@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("amazon@24");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(5000);
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Iphone").doubleClick().build().perform();
		
		
		
    }
}
