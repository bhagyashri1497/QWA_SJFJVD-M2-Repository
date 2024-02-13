package MethodofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithgetAttribute {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver=new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//to launch the web application
		driver.get("http://laptop-78siec6i/login.do");
		
		//identify username
		
		 WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		 //To get the  attribute
	//String nameav=username.getAttribute("name");
	//System.out.println(nameav);
		 //To get the tagname
		// System.out.println(username.getTagName());
		 //To get the CSSvalue
		 System.out.println(username.getCssValue("color"));
		
	}
}
