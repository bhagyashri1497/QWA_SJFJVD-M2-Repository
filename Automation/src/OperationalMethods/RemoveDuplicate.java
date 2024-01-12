package OperationalMethods;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("C:/Users/Bhagyashri/Desktop/Html/Movies%20Dropdown.html");
		
		WebElement dropdown=driver.findElement(By.id("Dropdown"));
		
		Select s= new Select(dropdown);
		
		List<WebElement> allDuplicateOptions = s.getOptions();
		
		TreeSet<String> set = new TreeSet<String>();
		
		for(int i=0;i<allDuplicateOptions.size();i++)
		{
			String allOptions = allDuplicateOptions.get(i).getText();
			set.add(allOptions);
			
		}
		
		for(String option :set)
		{
			System.out.println(option);
		}
		

	}

}
