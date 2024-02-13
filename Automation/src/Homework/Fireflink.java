package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fireflink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
		
		//to maximize the browser
		
		//optimized code to maximize the window
		driver.manage().window().maximize();
		
		
		//to open the web application
		driver.get("https://www.fireflink.com/");
		
		//to fetch the source code
		String sc=driver.getPageSource();
		System.out.println(sc);
		

	}

}
