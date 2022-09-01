package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 
		 //to login
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin");
		 driver.findElement(By.id("pass")).sendKeys("admin123");
		 driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
