package progrmas;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//div[@class='IiD88i _351hSN'])[1]"));

		driver.manage().window().maximize();
		driver.findElement(By.id("autosuggest")).sendKeys("IND");
		Thread.sleep(5000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		for(WebElement option : options)
		{
			if(option.getText().equalsIgnoreCase("indonesia"))
			{
				option.click();
				break;
			}
		}
	}

}
