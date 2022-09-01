package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
  @Test(priority = 0)
  public void i() 
  {
	 Reporter.log("i mrthod",true); 
  }
  @Test
  public void h() 
  {
	  Reporter.log("h mrthod",true);
  }
  
  @Test(priority = 1)
  public void g() 
  {
	  Reporter.log("g mrthod",true);
  }
  
  @Test
  public void f() 
  {
	  Reporter.log("f mrthod",true);
  }
  
  @Test(priority=2)
  public void e() 
  {
	  Reporter.log("e mrthod",true);
  }
  
  @Test
  public void d() 
  {
	  Reporter.log("d mrthod",true);
  }
  
  @Test(priority = 3)
  public void c() 
  {
	  Reporter.log("c mrthod",true);
  }
  
  @Test
  public void b() 
  {
	  Reporter.log("b mrthod",true);
  }
  
  @Test(priority = 4)
  public void a() 
  {
	  Reporter.log("a mrthod",true);
  }
}
