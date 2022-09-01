package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description = "This test is used to perform valid login")
  public void validActTimeTest () 
  {
	  Reporter.log("valid login is performed",true);
	  
  }
  @Test(description = "This test is used to perform invalid loging")
  public void invalidActTimeTest()
  {
	  Reporter.log("valid loging is performed",true);
  }
  
}
