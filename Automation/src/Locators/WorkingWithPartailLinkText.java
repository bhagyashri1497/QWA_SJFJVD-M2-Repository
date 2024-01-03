package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithPartailLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//to launch the web application
		driver.get("https://demowebshop.tricentis.com/");
		
		
		//to execute partial link text
		driver.findElement(By.partialLinkText("Reg")).click();

	}

}
