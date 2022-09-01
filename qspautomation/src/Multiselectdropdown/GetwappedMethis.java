package Multiselectdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetwappedMethis {


		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/Datta/Desktop/selenium/multiselectdropdawn.html");
			WebElement msDD = driver.findElement(By.id("menu"));
	         
			  Select sel = new Select(msDD);
			  WebElement wrapp = sel.getWrappedElement();
			  String options = wrapp.getText();
			  System.out.println(options);
		}

	}

