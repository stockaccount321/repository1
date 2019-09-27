package com.sampleprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {

          System.setProperty("webdriver.chrome.driver", "D:\\CommonJarFiles\\chromedriver.exe");
          WebDriver driver= new ChromeDriver();
          driver.get("http://www.primusbank.qedgetech.com");
          driver.findElement(By.linkText("Site Map")).click();
          
          //List<WebElement> links=driver.findElements(By.linkText("Home"));
          //System.out.println(links.size());
          
        /*  List<WebElement> link= driver.findElements(By.partialLinkText("Banking"));
          System.out.println(link.size());
          for(int i=0;i<= link.size();i++)
          {
        	  String alllinks= link.get(i).getText();
        	  System.out.println(alllinks);
        	  
          } */
          
          List<WebElement> lin= driver.findElements(By.tagName("a"));
          System.out.print(lin.size());
          
       
          
         
	}

}
