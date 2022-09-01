package excelSheetReadData;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidActtiTime {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://desktop-cl7jg7j/login.do");

                   Flib flib = new Flib();
                   int lr = flib.rowCount("./Data/TestDataAct.xlsx","invalid");
                   for(int i=1;i<=lr;i++)
                   {
                	  String username = flib.readExcelData("./Data/TestDataAct.xlsx","invalid",i,0);
                	  String password = flib.readExcelData("./Data/TestDataAct.xlsx","invalid",i,1);
                	  System.out.println(i);
                	  
                	  driver.findElement(By.name("username")).sendKeys(username);
					driver.findElement(By.name("pwd")).sendKeys(password);
					 
					driver.findElement(By.id("loginbutton")).click();
					Thread.sleep(3000);
					driver.findElement(By.name("username")).clear();
					
                	  
                	  
                	   
                   }
                   
}
}
