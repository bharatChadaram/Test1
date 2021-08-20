package practise1;

import java.util.Iterator;
import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://bharat//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> it = wh.iterator();
		String parent = it.next();
		String child = it.next(); 
		driver.switchTo().window(child);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".theme-btn.register-btn")).click();
		//driver.findElement(By.xpath("//a[@class='theme-btn register-btn']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		driver.findElement(By.id("username")).sendKeys("bharat");
		//driver.close();

		
	}

}
