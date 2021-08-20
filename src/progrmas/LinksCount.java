package progrmas;

import java.util.Set;

import java.util.Iterator;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(	driver.findElements(By.tagName("a")).size());
		
//limiting webdriver scope		
		WebElement footdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footdriver.findElements(By.tagName("a")).size()); //count of footer section

//to find specific column  links
		WebElement coldriver = footdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coldriver.findElements(By.tagName("a")).size());
		
		for(int i=1;i<coldriver.findElements(By.tagName("a")).size();i++)
		{
			String button = Keys.chord(Keys.CONTROL,Keys.ENTER);
			coldriver.findElements(By.tagName("a")).get(i).sendKeys(button);;
			Thread.sleep(5000);
		}
		
//get child pages title
			Set<String> window = driver.getWindowHandles();
			Iterator<String> it = window.iterator();
			
		while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		
	}

}
