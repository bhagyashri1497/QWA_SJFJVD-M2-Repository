package Homework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleRobot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		
		
		//Robot r = new Robot();
		//pressing the keys
	//	r.keyPress(KeyEvent.VK_CONTROL);
	//	r.keyPress(KeyEvent.VK_SHIFT);
	//	r.keyPress(KeyEvent.VK_C);
		
		//create the object of Actions class
				Actions act = new Actions(driver);
				
				//use context click
				act.contextClick().perform();
				
				Robot r = new Robot();
				for(int i=0;i<=9;i++)
				{
					Thread.sleep(2000);
					r.keyPress(KeyEvent.VK_DOWN);
					
				}
				r.keyPress(KeyEvent.VK_ENTER);
				
				
		
	}

}
