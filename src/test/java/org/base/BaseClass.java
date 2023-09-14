package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;
		
	}
	public static WebDriver chromeBrowser(String u) {
		chromeBrowser(u);
		if(u.equals("chrome")) {
			chromeBrowser(u);
		}
		return driver;
		
	 }
		
	public static WebDriver edgeBrowser(String u) {
		if(u.equals("edge")) {
			edgeBrowser(u);
		}
		return driver;
		
	 }
		
	
	public static WebDriver browserLaunch(String bname) {
		if(bname.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(bname.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(bname.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		return driver;
	}
	public static WebDriver browserLaunch2(String bname) {
		switch(bname){
		case "chrome":
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    break;
		case "edge":
			WebDriverManager.chromedriver().setup();
		    driver=new EdgeDriver();
		    break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
		    driver=new FirefoxDriver();
		    break;
		  default:
			  System.out.println("Invalid browser name");
		}
		return driver;
		}
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	public static void scroll(String script,WebElement e ) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)");
		js.executeScript("arguments[0].scrollIntoView(false)");
		
	}
	
	public static Object getAttributes(WebElement a) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		Object script = js.executeScript("return arguments[0].getAttribute('value')", a);
		return script;
		
	}
	
    public static void implicitlyWait(int a) {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));
    }
	public static void sendkeys(WebElement e,String value) {
		e.sendKeys(value);
	}
    public static void click(WebElement e) {
    	e.click();
    }
	public static WebDriver getDriver() {
		return driver;
	}
    public static String getCurrentUrl() {
    	String currentUrl = driver.getCurrentUrl();
		return currentUrl;
     }
    public static void windowsHandling(String windowsId) {
    	driver.switchTo().window(windowsId);
    }
    public static String getTitle() {
    	String title = driver.getTitle();
		return title;
     }
    public static void quit() {
    	driver.quit();
    }
    public static void clear(WebElement e) {
    	e.clear();
    }
    public static void refresh() {
     driver.navigate().refresh();
    }
    public static String getText(WebElement e) {
    	String text = e.getText();
		return text;
    }

    public static String getAttribute(WebElement e) {
    	String attribute = e.getAttribute("value");
		return attribute;
     }
    public static void moveToElement(WebElement e) {
    	Actions a=new Actions(driver);
    	a.moveToElement(e).perform();
    }
    public static void dragAndDrop(WebElement src,WebElement dest) {
    	Actions a=new Actions(driver);
    	a.dragAndDrop(src,dest).perform();
    }
    public static void dropDown(WebElement e) throws AWTException  {
    	Robot r= new Robot();
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void selectByIndex(WebElement e,int index) {
    	Select s= new Select(e);
    	s.selectByIndex(index);
    
    }
    public static void selectByValue(WebElement e,String Value) {
    	Select s= new Select(e);
    	s.selectByValue(Value);
    }
    public static WebElement findElement(String loc,String value) {
    	WebElement t=null;
    	if(loc.equals("id")) {
    		t=driver.findElement(By.id(value));
    	}
    	else if(loc.equals("name")) {
    		t=driver.findElement(By.name(value));
    	}
    	else if(loc.equals("xpath")) {
    		t=driver.findElement(By.xpath(value));
    	}
		return n;
    }

}
