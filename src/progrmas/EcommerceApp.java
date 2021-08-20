package progrmas;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceApp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		
		//Thread.sleep(5000);
				for (int i = 1; i < 5; i++) {
		//			driver.findElement(By.xpath("(//a[@class='increment'])[2]")).click();

				}
		//		driver.findElement(By.xpath("(//div[@class='product-action'])[2]/button")).click();
				
		
		
		List<WebElement> veg = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0; i<veg.size();i++)
		{
			String s = veg.get(i).getText();
			if(s.contains("Cucumber"))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			}
			
		}
		
	}

}
