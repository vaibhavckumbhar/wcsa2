package excelSheetReadData;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import methodsOfWebDriver.chromeDriver;

public class ActiTimeloging {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://desktop-cl7jg7j/login.do");
		   
		 
		Flib flib = new Flib();
		String username = flib.readExcelData("./Data/TestDataAct.xlsx", "validup", 1, 0);
		String pasword = flib.readExcelData("./Data/TestDataAct.xlsx","validup",1,1);
		 
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(pasword);
		
		driver.findElement(By.id("loginButton")).click();
		
		
	}

}
