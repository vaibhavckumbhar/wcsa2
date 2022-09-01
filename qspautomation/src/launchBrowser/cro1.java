package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class cro1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//to close the chrome
		driver.close();
	}
 
	
}

