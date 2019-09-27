package com.sampleprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithLinks {

	public static void main(String[] args) throws Throwable {
		
          System.setProperty("webdriver.chrome.driver", "D://commonjarFiles//chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.get("http://www.google.com");
          Thread.sleep(2000);
          driver.findElement(By.linkText("Gmail")).click();
          
          String expgtitle,actpgtitle;
          expgtitle = "Gmail";
          actpgtitle = driver.getTitle();
          if(actpgtitle.toLowerCase().contains(expgtitle.toLowerCase()))
          {
        	  System.out.println("Test Pass");
          }
          else
		
          {
        	  System.out.println("Test Fail");
          }
          
          
          
          
	}

}
