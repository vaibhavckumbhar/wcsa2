package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElememtsMethod1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com/");
		  driver.findElement(By.name("q")).sendKeys("bike");
			Thread.sleep(5000);
			
			List<WebElement>webElementSuggessions =driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
			
			for(int i=0;i<webElementSuggessions.size();i++)
			{
				WebElement sugg=webElementSuggessions.get(i);
				String textOfSugg=sugg.getText();
				Thread.sleep(1000);
				System.out.println(textOfSugg);
			}
			
			for(WebElement sugg:webElementSuggessions)
			{
				String textofWebelement=sugg.getText();
				System.out.println(textofWebelement);
			}

	}

}
