package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sumo {
  @Test
  public void mathed1() {
	  Reporter.log("vaibhav",true);
  }
  @Test
  public void mathed2() {
	  Reporter.log("chandrkant",true);
  }
  @Test
  public void mathed3() {
	  Reporter.log("vaibhav",true);
  }
  @Test
  public void mathed4() {
	  int i=9;
	  int j=0;
	  int res=i/j;
	  System.out.println(res);
	  Reporter.log("method4",true);
  }
}
