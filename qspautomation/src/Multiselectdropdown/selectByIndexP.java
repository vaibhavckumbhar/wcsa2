package Multiselectdropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByIndexP {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Vaibhav/Desktop/webelement/multiselectdropdown.html");
		Thread.sleep(3000);
		 WebElement order = driver.findElement(By.id("menu"));
		  Select sel = new Select(order);
		  Thread.sleep(3000);
		  sel.deselectByIndex(2);
	}
	

}
