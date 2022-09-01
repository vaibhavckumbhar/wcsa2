package launchBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Fir1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
	}
	

}
