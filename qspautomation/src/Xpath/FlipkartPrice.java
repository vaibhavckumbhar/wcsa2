package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPrice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(5000);
		 
		 
		 //to login
		 driver.findElement(By.xpath("//button[.='✕']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.name("q")).sendKeys("laptop");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		 Thread.sleep(5000);
		 String priceOfTheFirstSuggestion = driver.findElement(By.xpath("//div[@class='_25b18c']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'][1]")).getText();
         System.out.println("price of the frist suggestion"+priceOfTheFirstSuggestion);
	

	}

}
