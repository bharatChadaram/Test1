package progrmas;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesPractise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it= window.iterator();
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());// still code left
		driver.switchTo().window(parentID);
	
	
		
	}

}
