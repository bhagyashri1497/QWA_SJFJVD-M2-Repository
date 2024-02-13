package Homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMovies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Bhagyashri/Desktop/Html/Movies%20Dropdown.html");
		WebElement dropdown = driver.findElement(By.id("Dropdown"));
		Select s=new Select(dropdown);
		//s.selectByValue("salaar");
		//s.selectByValue("KGF");
		//s.selectByValue("Pushpa");
		//boolean value=s.isMultiple();
		
		//System.out.println(value);
		WebElement alloptions = s.getWrappedElement();
		System.out.println(alloptions.getText());
		
		
		
	}

}
