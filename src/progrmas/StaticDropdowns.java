package progrmas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		WebElement dd = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s = new Select(dd);
		Thread.sleep(5000);
		s.selectByIndex(3);
		Thread.sleep(5000);
		s.selectByValue("AED");
		Thread.sleep(5);

	}
}
