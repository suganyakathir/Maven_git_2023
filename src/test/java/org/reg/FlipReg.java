package org.reg;

import java.util.Date;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
	private void test1() {
		FlipLogin f=new FlipLogin();
		click(f.getClkClose());
		sendkeys(f.getClkSearch(),"iphone");
		f.getClkSearch().submit();
	    System.out.println(getText(f.getTxtPrint()));
	    
	}
	@Test
    private void test2() {
		List<WebElement> productNames = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	for(int i=0;i<productNames.size();i++) {
		String txt = productNames.get(i).getText();
		System.out.println(txt);
	}
	int s = productNames.size();
	System.out.println(s);
	}
	
	@Test
	private void test3() {
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
        for(int j=0;j<price.size();j++) {
        	String prices = price.get(j).getText();
        	System.out.println(prices);
        }
		}
	
	@Test
	private void test5() {
		List<WebElement> productNamesL = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> priceL = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	    for(int k=0;k<24;k++) {
	    	String product = productNames1.get(k).getText();
	    	String price = price1.get(k).getText();
	    	System.out.println(product+" = "+price);
	    }
	
	}
	

}
