package Multiselectdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {


		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("file:///C:/Users/Datta/Desktop/selenium/multiselectdropdawn.html");
			 WebElement msDropDown = driver.findElement(By.id("menu"));
			Select sel = new Select(msDropDown);
			boolean status = sel.isMultiple();
			System.out.println(status);
			 

		}

	}
