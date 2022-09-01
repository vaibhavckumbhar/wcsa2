package Multiselectdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectOption {


		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/Vaibhav/Desktop/webelement/multiselectdropdown.html");
			WebElement msDropDowan = driver.findElement(By.id("menu"));
			Select sel = new Select(msDropDowan);
			for(int i=2;i<=6;i++)
			{
				 sel.selectByIndex(i);
			}
			WebElement FirstSelectedOption = sel.getFirstSelectedOption();
			String op = FirstSelectedOption.getAccessibleName();
			System.out.println(op);
		}
}
