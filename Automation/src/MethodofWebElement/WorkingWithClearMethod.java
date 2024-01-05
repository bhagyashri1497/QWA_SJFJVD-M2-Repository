package MethodofWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClearMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		WebElement Email= driver.findElement(By.name("Email"));
		Email.sendKeys("parkalebg96@gmail.com"); 
		Thread.sleep(2000);
		
		Email.clear();
		
		
		WebElement Password=driver.findElement(By.name("Password"));
		Password.sendKeys("Shree@123");
		
		
		
		

	}

}
