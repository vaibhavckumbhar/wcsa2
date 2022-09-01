package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	public static void main(String[] args) throws InterruptedException {
	  
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		 //to login
		 driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		 driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='btnLogin']")).click();


	}

}
