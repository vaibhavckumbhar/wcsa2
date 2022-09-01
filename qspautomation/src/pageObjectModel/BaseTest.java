package pageObjectModel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoconstant {
	static WebDriver driver;
	public void openbrowser() throws IOException
	{
		Flib flib = new Flib();
		String browser = flib.readpropertyFileData(PROP_PATH, "browser");
		String url = flib.readpropertyFileData(PROP_PATH,"url");
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY,GECKO_VALUE);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
			
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
