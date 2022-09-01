package WebElementMethods;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
			 java.util.List<WebElement> aniket = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));

			for(WebElement s1:aniket) {
				String p1 = s1.getText();
				System.out.println(p1);
			}
	}

}