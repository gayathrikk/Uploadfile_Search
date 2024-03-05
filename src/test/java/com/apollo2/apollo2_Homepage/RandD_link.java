package com.apollo2.apollo2_Homepage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RandD_link {
	
private RemoteWebDriver driver;
	
	@BeforeTest
	
	public void setup() throws MalformedURLException
	{
		  DesiredCapabilities dc = DesiredCapabilities.chrome();
	        URL url = new URL("http://172.20.23.7:5554/wd/hub");
	        driver = new RemoteWebDriver(url, dc);
	       
	}

    @Test(priority=1)
    public void launch() throws InterruptedException {
    	driver.get("https://apollo2.humanbrain.in/viewer/annotation/portal");
        driver.manage().window().maximize();
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentURL);
    	 driver.switchTo().frame(0);
        
    }
    
    @Test(priority=2)
    public void homepagehighlights() throws InterruptedException
    {
    	 driver.findElement(By.xpath("(//a[text()='HIGHLIGHTS'])[1]")).click();
    	 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='R&D Publications']")).click();
    }
    
    @Test(priority=3)
    public void patents_link1() throws InterruptedException
    {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	String parentWindow = driver.getWindowHandle();
    	driver.findElement(By.xpath("(//p[@class='pubTitle'])[1]")).click();
    	wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		  Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(parentWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	      String actualtitle="WO2023275894A1 - Automated coverslipper for large format slides with switchable compatibility to handle multi format slides - Google Patents";  
    	  String Expectedtitle=driver.getTitle();
    	  System.out.println("Patents link1 :"+Expectedtitle);
    	  Assert.assertEquals(actualtitle, Expectedtitle, "Title do not match!");
    	  driver.close();
    	  driver.switchTo().window(parentWindow);
    	  Thread.sleep(3000);
    }
    @Test(priority=4, alwaysRun=true)
    public void publications_link1() throws InterruptedException
    {
    	driver.switchTo().frame(0);
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	String parentWindow = driver.getWindowHandle();
    	driver.findElement(By.xpath("(//p[@class='pubTitle'])[2]")).click();
    	Thread.sleep(3000);
    	wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		  Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(parentWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	      String Expectedtitle=driver.getTitle();
	      String actualtitle="A Standardized Protocol for the Safe Retrieval of Infectious Postmortem Human Brain for Studying Whole-Brain Pathology - PubMed";  
    	  System.out.println("Publications link1 :"+Expectedtitle);
    	  Assert.assertEquals(actualtitle, Expectedtitle, "Title do not match!");
    	  driver.close();
    	  driver.switchTo().window(parentWindow);
    	  Thread.sleep(3000);
    }
    
    @Test(priority=5, alwaysRun=true)
    public void publications_link2() throws InterruptedException
    {
    	driver.switchTo().frame(0);
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	String parentWindow = driver.getWindowHandle();
    	driver.findElement(By.xpath("(//p[@class='pubTitle'])[3]")).click();
    	Thread.sleep(3000);
    	wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		  Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(parentWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	      String Expectedtitle=driver.getTitle();
	      String actualtitle="Wide field block face imaging using deep ultraviolet induced autofluorescence of the human brain - PubMed";  
    	  System.out.println("Publications link2 :"+Expectedtitle);
    	  Assert.assertEquals(actualtitle, Expectedtitle, "Title do not match!");
    	  driver.close();
    	  driver.switchTo().window(parentWindow);
    	  Thread.sleep(3000);
    }
    
    @Test(priority=6, alwaysRun=true)
    public void publications_link3() throws InterruptedException
    {
    	driver.switchTo().frame(0);
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	String parentWindow = driver.getWindowHandle();
    	driver.findElement(By.xpath("(//p[@class='pubTitle'])[4]")).click();
    	Thread.sleep(3000);
    	wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		  Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(parentWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	      String Expectedtitle=driver.getTitle();
	      String actualtitle="Semantic segmentation of microscopic neuroanatomical data by combining topological priors with encoder-decoder deep networks - PubMed";  
    	  System.out.println("Publications link3 :"+Expectedtitle);
    	  Assert.assertEquals(actualtitle, Expectedtitle, "Title do not match!");
    	  driver.close();
    	  driver.switchTo().window(parentWindow);
    	  Thread.sleep(3000);
    }
    
    @Test(priority=7, alwaysRun=true)
    public void publications_link4() throws InterruptedException
    {
    	driver.switchTo().frame(0);
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	String parentWindow = driver.getWindowHandle();
    	driver.findElement(By.xpath("(//p[@class='pubTitle'])[5]")).click();
    	Thread.sleep(3000);
    	wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		  Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(parentWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	      String Expectedtitle=driver.getTitle();
	      String actualtitle="Image Quality Assessment of Large Tissue Samples Stained using a Customized Automated Slide Stainer | IEEE Conference Publication | IEEE Xplore";  
    	  System.out.println("Publications link4 :"+Expectedtitle);
    	  Assert.assertEquals(actualtitle, Expectedtitle, "Title do not match!");
    	  driver.close();
    	  driver.switchTo().window(parentWindow);
    	  Thread.sleep(3000);
    }
    
    @Test(priority=8, alwaysRun=true)
    public void publications_link5() throws InterruptedException
    {
    	driver.switchTo().frame(0);
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	String parentWindow = driver.getWindowHandle();
    	driver.findElement(By.xpath("(//p[@class='pubTitle'])[6]")).click();
    	Thread.sleep(3000);
    	wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		  Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(parentWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	      String Expectedtitle=driver.getTitle();
	      String actualtitle="Cover slip handling and mounting media dispensation for reliable automated cover slipping of large tissue sections | IEEE Conference Publication | IEEE Xplore";  
    	  System.out.println("Publications link5 :"+Expectedtitle);
    	  Assert.assertEquals(actualtitle, Expectedtitle, "Title do not match!");
    	  driver.close();
    	  driver.switchTo().window(parentWindow);
    	  Thread.sleep(3000);
    }
    
    @Test(priority=9, alwaysRun=true)
    public void publications_link6() throws InterruptedException
    {
    	driver.switchTo().frame(0);
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	String parentWindow = driver.getWindowHandle();
    	driver.findElement(By.xpath("(//p[@class='pubTitle'])[7]")).click();
    	Thread.sleep(3000);
    	wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		  Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(parentWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	      String Expectedtitle=driver.getTitle();
//	      String actualtitle= "Automation of slide staining for large tissue sections" ;  
    	  System.out.println("Publications link6 :"+Expectedtitle);
//    	  Assert.assertEquals(actualtitle, Expectedtitle, "Title do not match!");
    	  driver.close();
    	  driver.switchTo().window(parentWindow);
    	  Thread.sleep(3000);
    }
    
    @Test(priority=10, alwaysRun=true)
    public void publications_link7() throws InterruptedException
    {
    	driver.switchTo().frame(0);
    	WebDriverWait wait = new WebDriverWait(driver, 30);
    	String parentWindow = driver.getWindowHandle();
    	driver.findElement(By.xpath("(//p[@class='pubTitle'])[8]")).click();
    	Thread.sleep(3000);
    	wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		  Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(parentWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	      String Expectedtitle=driver.getTitle();
//	      String actualtitle= "Automation of slide staining for large tissue sections" ;  
    	  System.out.println("Publications link7 :"+Expectedtitle);
//    	  Assert.assertEquals(actualtitle, Expectedtitle, "Title do not match!");
    	  driver.close();
    	  driver.switchTo().window(parentWindow);
    	  Thread.sleep(3000);
    }
    
     @AfterTest
    public void  close()
    {
    	driver.quit();
    }
		  

}
