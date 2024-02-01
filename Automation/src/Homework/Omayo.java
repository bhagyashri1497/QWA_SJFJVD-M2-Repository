package Homework;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Omayo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://omayo.blogspot.com/");
		
		//driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
	
		 /*String title=driver.getTitle();
		
		System.out.println("The title of current webpage is:"+title);
		*/
		
		Set<String> all_Id = driver.getWindowHandles();

		for(String id:all_Id)
		{
		driver.switchTo().window(id);
		if (driver.getTitle().equals("omayo (QAFox.com)"))
		{
		System.out.println(driver.getTitle());
		break;
		}
		else
		{
		driver.close();
		}
		}
		
		
		

	}

}
