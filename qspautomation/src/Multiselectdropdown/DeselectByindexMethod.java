package Multiselectdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByindexMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.get("file:///C:/Users/Vaibhav/Desktop/webelement/multiselectdropdown.html");
		WebElement multiselected = driver.findElement(By.id("menu"));
		Select sel = new Select(multiselected);
		sel.deselectByValue("v4");
		Thread.sleep(3000);
		sel.deselectByIndex(2);
		
		
		

}

}
