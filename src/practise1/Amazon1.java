package practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {

	public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver", "C://bharat//chromedriver.exe" );
         WebDriver driver =  new ChromeDriver();
         driver.get("https://www.facebook.com/");
         driver.manage().window().maximize();
         //driver.findElement(By.name("email")).sendKeys("bharat");
         driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("bharat");
         //driver.findElement(By.cssSelector(".inputtext._55r1._6luy._9npi")).sendKeys("");
        // driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy _9npi']")).sendKeys("");
         driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("chandhini");
         //driver.findElement(By.xpath("//font[text()='Forgot your password?']")).click();
         
         driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
         
	}

}
