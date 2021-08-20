package practise1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException, IOException {
				System.setProperty("webdriver.chrome.driver", "C://bharat//chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.com/");
				WebElement hover = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
				Actions a = new Actions(driver); 
				a.moveToElement(hover).build().perform();
				driver.findElement(By.xpath("//span[.='Sign in']")).click();
				 driver.findElement(By.id("ap_email")).sendKeys("balu.bharat39@gmail.com");
				 WebElement usertext = driver.findElement(By.id("ap_email"));
				a.doubleClick(usertext).build().perform();
				driver.findElement(By.id("continue")).click();
				driver.findElement(By.id("ap_password")).sendKeys("amazon@24");
				driver.findElement(By.id("signInSubmit")).click();
				Thread.sleep(5000);
				WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
				a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("iphone").build().perform();
				
				
				TakesScreenshot ts = (TakesScreenshot)driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				//FileUtils.copyFile(source, new File("F://screenshot.png"));
				
				//File destination = new File("F://screen.png");
				//FileUtils.copyFile(source, destination);
				
				String destination = System.getProperty("userdir")+"\\screenshots\\f.png";
				FileUtils.copyFile(source, new File(destination));
				
				
				
				
				
				
				
				
				
				
				
	}

}
