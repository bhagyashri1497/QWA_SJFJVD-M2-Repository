package Homework;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MultipleDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Bhagyashri/Desktop/Html/Dropdown.html");
		WebElement dropdown = driver.findElement(By.id("movies"));
		Select s = new Select(dropdown);
		WebElement allOptions = s.getWrappedElement();
		System.out.println(allOptions.getText());
		//it will used to identify particular dropdwn is multiselect or not
		/*boolean value=s.isMultiple();
		
		System.out.println(value);
		//it will return all the options present in dropdown
		List<WebElement> alloption = s.getOptions();
		
		for(WebElement option : alloption)
		{
			System.out.println(option.getText());
		}
		/*for(int i=0;i<=3;i++)
		{
		s.selectByIndex(i);
		}
		
		Thread.sleep(2000);
		for(int i=0;i<=3;i++)
		{
			s.deselectByIndex(i);
			
		}*/
		//it will return first selected option
		/*for(int i=0;i<4;i++)
		{
			Thread.sleep(2000);
			s.selectByIndex(i);
			System.out.println(s.getFirstSelectedOption().getText());
		}
		*/
		

	}

}
