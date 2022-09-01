package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fiendelement1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement Email = driver.findElement(By.id("email"));
		System.out.println("usrname:"+Email);
		Email.sendKeys("vaibhavkumbhar074@gmail.com");
		Thread.sleep(3000);
		Email.clear();
		Email.sendKeys("kumbhar@074gmail.com");
		Thread.sleep(3000);
		Email.clear();
	}

}
