package WebElementMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("helmet");

	java.util.List<WebElement> bike = (List<WebElement>) driver.findElement(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		for(WebElement v1:bike)
		{
			String k1 = v1.getText();
			System.out.println(k1);
		}
	}

}
