package progrmas;

import java.util.Arrays;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ArrayCart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String[] items = {"Cucumber", "Cauliflower","Beetroot"};

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();

		List<WebElement> veg = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < veg.size(); i++) {
			String[] s = veg.get(i).getText().split("-");
			String item1 =  s[0].trim();
			List<String> a = Arrays.asList(items);
			
			int j= 0;
			if (a.contains(item1)) {
				j++;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				if(j==3)
					break;
				
				
			}
			
		}
	}

}
