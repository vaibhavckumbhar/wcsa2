package framehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Vaibhav/Desktop/username2.html");
		Thread.sleep(50000);
		driver.findElement(By.id("un")).sendKeys("Vaibhav");
		Thread.sleep(2000);
		driver.switchTo().frame("frnm");
		driver.findElement(By.id("pwd")).sendKeys("vk1234");
		


		
		
		
		
		
	}

}
