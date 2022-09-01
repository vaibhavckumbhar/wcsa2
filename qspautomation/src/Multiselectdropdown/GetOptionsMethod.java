package Multiselectdropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {



		public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/Vaibhav/Desktop/webelement/multiselectdropdown.html");
			WebElement ssDropDowan = driver.findElement(By.id("menu"));
			Select sel = new Select(ssDropDowan);
			List<WebElement> var = sel.getOptions();
			
			for(int i=0;i<var.size();i++)
			{
				WebElement op = var.get(i);
				String text = op.getText();
				System.out.println(text);
			}

		}

	}
