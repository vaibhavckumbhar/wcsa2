package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			WebElement loginButton = driver.findElement(By.name("login"));
			Point point = loginButton.getLocation();
	        int Xaxis = point.getX();
	        int Yaxis = point.getY();
	        System.out.println("The Placement of login button is as follow");
	        System.out.println("Xaxis distance :"+Xaxis);
	        System.out.println("Yaxis distance :"+Yaxis);
		}

	}