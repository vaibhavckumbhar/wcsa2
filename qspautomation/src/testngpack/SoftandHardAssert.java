package testngpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import zmq.socket.reqrep.Rep;

public class SoftandHardAssert {
	
	WebDriver driver;
	@BeforeMethod
  public void setup() 
  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-cl7jg7j/login.do");
  }
	@Test
	public void actiTime() throws InterruptedException
	{
		String loginPageTitle = driver.getTitle();
		
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(loginPageTitle,"actiTime-login");
		Reporter.log("login page titleis verifide",true);
		
		boolean statusofUsernametexbox = driver.findElement(By.name("username")).isDisplayed();
		Assert.assertEquals(statusofUsernametexbox,true);
		Reporter.log("user name te box is displayed",true);
		driver.findElement(By.name("username")).sendKeys("admin");
		
		
		boolean statusofpaswordtext = driver.findElement(By.name("pwd")).isDisplayed();
		Assert.assertEquals(statusofpaswordtext,true);
		Reporter.log("pasword name te box is displayed",true);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		
		boolean statusofLoginButton = driver.findElement(By.name("loginButton")).isDisplayed();
		Assert.assertEquals(statusofLoginButton,true);
		Reporter.log("login button is displayed",true);
		driver.findElement(By.name("loginButton")).click();
		
		Thread.sleep(3000);
		
	       String homePageTitle = driver.getTitle();
	       
	       softassert.assertEquals(homePageTitle,"actiTIME-Enter Time-Track");
	       
	       Reporter.log("home page title is verified",true);
	       
	       Reporter.log("creat user",true);
	       Reporter.log("creat user",true);
	       softassert.assertAll();
	       
	}
	  
	@AfterMethod
	public void tearDown()
	{
	   driver.quit();	
	
	}
}
