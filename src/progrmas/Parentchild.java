package progrmas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentchild {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.google.com/");
       driver.manage().window().maximize();
       Thread.sleep(5);
       //driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/div")).sendKeys("Maheshbabu");
       driver.findElement(By.name("q")).sendKeys("Maheshbabu");
	}

}
