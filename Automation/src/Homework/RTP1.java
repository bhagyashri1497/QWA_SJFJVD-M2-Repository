package Homework;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RTP1 {
	static WebDriver driver;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter browser value");
		 int num = sc.nextInt();
		
		switch(num)
		{
		case 1:
		{
			driver=new ChromeDriver();
			break;
		}
		case 2:
		{
			driver=new FirefoxDriver();
			break;
		}
		case 3:
		{
			driver=new EdgeDriver();
			break;
		}
		
		default : System.out.println("Invalid browser");
	}
		
	
		
	}

}
