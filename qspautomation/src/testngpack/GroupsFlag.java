package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupsFlag {
  @Test(groups = "FUNCTIONAL")
  public void FT1()
  {
	  Reporter.log("Fuctional Testcase 1");
  }
  @Test(groups ="INTGRATION")
  public void IT1() 
  {
	  Reporter.log("Intigration Testcase 1");
  }
  @Test(groups = "SMOKE")
  public void ST1()
  {
	  Reporter.log("Fuctional Testcase 1");
  }
  //----------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void FT2()
  {
	  Reporter.log("Fuctional Testcase 2");
  }
  @Test(groups ="INTGRATION")
  public void IT2() 
  {
	  Reporter.log("Intigration Testcase 2");
  }
  @Test(groups = "SMOKE")
  public void ST2()
  {
	  Reporter.log("Fuctional Testcase 2");
  }
  //------------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void FT3()
  {
	  Reporter.log("Fuctional Testcase 3");
  }
  @Test(groups ="INTGRATION")
  public void IT3() 
  {
	  Reporter.log("Intigration Testcase 3");
  }
  @Test(groups = "SMOKE")
  public void ST3()
  {
	  Reporter.log("Fuctional Testcase 3");
  }
  //-------------------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void FT4()
  {
	  Reporter.log("Fuctional Testcase 4");
  }
  @Test(groups ="INTGRATION")
  public void IT4() 
  {
	  Reporter.log("Intigration Testcase 4");
  }
  @Test(groups = "SMOKE")
  public void ST4()
  {
	  Reporter.log("Fuctional Testcase 4");
	  
  }
  //----------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void FT5()
  {
	  Reporter.log("Fuctional Test case 5");
  }
  @Test(groups ="INTGRATION")
  public void IT5() 
  {
	  Reporter.log("Intigration Test case 5");
  }
  @Test(groups = "SMOKE")
  public void ST5()
  {
	  Reporter.log("Fuctional Test case 5");
  }
  
  //---------------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void FT6()
  {
	  Reporter.log("Fuctional Test case 6");
  }
  @Test(groups ="INTGRATION")
  public void IT6() 
  {
	  Reporter.log("Intigration Test case 6");
  }
  @Test(groups = "SMOKE")
  public void ST6()
  {
	  Reporter.log("Fuctional Test case 6");
  }
}
