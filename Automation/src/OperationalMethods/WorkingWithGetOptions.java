package OperationalMethods;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithGetOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
		
		WebElement dropdown=driver.findElement(By.id("select3"));
			
		Select s = new Select(dropdown);
		
		List<WebElement> alloption = s.getOptions();
		
		for(WebElement option : alloption)
		{
			System.out.println(option.getText());
		}

	}

}
