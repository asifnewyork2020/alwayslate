package com.expedia.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flightbase {
	
	//we are public web driver,because we want to share our webdrives in stepdef
	public WebDriver driver;
	
	// we want to use it in different packages
      public void launchBrowser() {
    	 
    	 WebDriverManager.chromedriver().setup();
    	 driver = new ChromeDriver();
    	 driver.get("https://www.expedia.com/login?ckoflag=0&uurl=e3id%3Dredr%26rurl%3D%2F%3Flogout%3D1");
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	 
      }
    	 
    	public void closeAllbrowser()
    	{
    		
    		driver.quit();
    		 
    		 
    	 

	}
		
}
