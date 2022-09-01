package testngpack;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
  @Test
  public void M1() 
  {
	 Reporter.log("test m1",true); 
	 
  }
  @Test
  public void M2() 
  {
	 Reporter.log("test m2",true); 
	 
  }
  @BeforeMethod
  public void M3() 
  {
	 Reporter.log("test m3",true); 
	 
  }
  @BeforeClass
  public void M4() 
  {
	 Reporter.log("test m4",true); 
	 
  }
  @BeforeTest
  public void M5() 
  {
	 Reporter.log("test m5",true); 
	 
  }
  @AfterMethod
  public void M6() 
  {
	 Reporter.log("test m6",true); 
	 
  }
  @AfterClass
  public void M7() 
  {
	 Reporter.log("test m7",true); 
	 
  }
  @AfterTest
  public void M8() 
  {
	 Reporter.log("test m8",true); 
	 
  }
}
