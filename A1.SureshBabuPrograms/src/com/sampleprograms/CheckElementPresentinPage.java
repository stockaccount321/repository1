package com.sampleprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckElementPresentinPage {

	public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D://commonjarFiles//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
         driver.get("http://primusbank.qedgetech.com");
         driver.findElement(By.linkText("Site Map")).click();
         List<WebElement> links=driver.findElements(By.tagName("a"));
         System.out.println(links.size());
         
         String explink= "payments";
         boolean flag= false;
         for(int i=0;i<links.size();i++)
         {
        	 String actlink= links.get(i).getText();
        	 if(explink.equalsIgnoreCase(actlink))
        	 {
        		 flag=true;
        		 break;
        	 }
         }
         if(flag)          //here we are not using ! symbol. why i don"tknow
         {
        	 System.out.println(explink+  "link is present in the list");
         }else
         {
        	 System.out.println(explink+  "link is not present in the list");
         }
	}

}
