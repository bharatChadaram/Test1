package practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://bharat//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame("mce_0_ifr");
		Actions a = new Actions(driver);
		WebElement text = driver.findElement(By.id("tinymce"));
		a.moveToElement(text).click().keyDown(Keys.SHIFT).doubleClick().sendKeys("bharat").build().perform();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		driver.close();
	} 

}
