package org.reg;

import java.util.Date;

import org.base.BaseClass;
import org.test.FlipLogin;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipReg extends BaseClass {
	@BeforeClass
	  private void beforeclass() {
		 
		browserLaunch2("edge");
		urlLaunch("https://www.flipkart.com/");
		implicitlyWait(20);
	}
	@AfterClass
	  private void afterclass() {
		quit();
	}
	  @BeforeMethod
	  private void beforemethod() {
		Date d=new Date();
		System.out.println("start time "+d);
	}
	  @Test(enabled=false)
	  @AfterMethod
	  private void aftermethod() {
		Date d=new Date();
		System.out.println("end time "+d);
	} 
	@Test
	private void test3() {
		FlipLogin f=new FlipLogin();
		click(f.getClkClose());
		sendkeys(f.getClkSearch(),"iphone");
		f.getClkSearch().submit();
	    System.out.println(getText(f.getTxtPrint()));
	    
	}
	

}
