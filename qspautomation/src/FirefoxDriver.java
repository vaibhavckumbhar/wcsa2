
public class FirefoxDriver {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		Thread.sleep(5000);
		

	}
		
}
