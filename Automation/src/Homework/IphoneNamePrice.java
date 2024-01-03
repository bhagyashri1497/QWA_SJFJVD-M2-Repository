package Homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneNamePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		
		driver.findElement(By.xpath("//input[contains(@class,'Pke')]")).sendKeys("iphone",Keys.ENTER);
		
		//WebElement iphonePrice= driver.findElement(By.xpath("//div[text()='APPLE iPhone 15 Plus (Blue, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		 List<WebElement> allIphone = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		 List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		 
		//System.out.println(iphonePrice.getText());
		//System.out.println(iphonename.getText());
		
	
		for(int i=0;i<allIphone.size();i++)
		{
			System.out.println(allIphone.get(i).getText());
			
			for(int j=0;j<allPrice.size();j++)
			{
				System.out.println(allPrice.get(j).getText());
				
				System.out.println(allIphone.get(i).getText()+ allPrice.get(j).getText());
			}
		}
	}

}
