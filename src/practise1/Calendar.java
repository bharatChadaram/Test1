package practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar 
{

	public static void main(String[] args) 
	{
			System.setProperty("webdriver.chrome.driver", "C://bharat//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.path2usa.com/travel-companions");
			driver.findElement(By.cssSelector(".text.form-control")).click();
        while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("December 2021"))
		{
	      driver.findElement(By.cssSelector(".next")).click();
		}
        int count = driver.findElements(By.cssSelector(".day")).size();
        for (int i=0; i < count;i++)
        {
        	String day = driver.findElements(By.cssSelector(".day")).get(i).getText();
        	if(day.equalsIgnoreCase("2"))
        	{
        		driver.findElements(By.cssSelector(".day")).get(i).click();
        		break;
        	}
        }
	}

}
