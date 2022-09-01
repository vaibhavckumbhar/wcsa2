package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {


		public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			WebElement loginButton = driver.findElement(By.name("login"));
			Dimension rect = loginButton.getSize();
			int hieght1 = rect.getHeight();
			int width1 = rect.getWidth();
			System.out.println(hieght1);
			System.out.println(width1);
		}
}