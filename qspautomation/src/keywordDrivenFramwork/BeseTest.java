package keywordDrivenFramwork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import methodsOfWebDriver.chromeDriver;

public class BeseTest implements IAutoConstant {
	static WebDriver driver;
		
	public void openbrowser() throws IOException
	{
		 FlibForKeyWord flib = new FlibForKeyWord();
		 String browser= flib.readpropertyFileData(PROP_PATH,"browser");
		 String urll = flib.readpropertyFileData(PROP_PATH,"url");
		 if(browser.equalsIgnoreCase("chrome"))
		 {
			 System.setProperty(CHEROME_KEY,CHROME_VALUE);
			 driver=new chromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 driver.get(urll);
		 }
		 else if (browser.equalsIgnoreCase("firefox"))
		 {
			System.setProperty(GECKO_KEY,GECKO_VALUE);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(urll);
		 }
		 else
		 {
			 System.out.println("invalid data");
		 }
		 
		 
	}
	public void closebrowser()
	{
		driver.quit();
	}
	

}
