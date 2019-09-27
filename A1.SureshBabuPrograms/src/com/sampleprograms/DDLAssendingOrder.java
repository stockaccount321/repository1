package com.sampleprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDLAssendingOrder {

	public static void main(String[] args) throws Throwable {
	
              System.setProperty("webdriver.chrome.driver", "D://commonjarFiles//chromedriver.exe");
              WebDriver driver=new ChromeDriver();
              driver.get("http://www.primusbank.qedgetech.com");
              Thread.sleep(2000);
              
              Select clist=new Select(driver.findElement(By.id("drlist")));
              List<WebElement> list=clist.getOptions();
              System.out.println(list.size());
              
              boolean order=true;
              for(int i=1;i<list.size();i++)
              {
            	  String str1= list.get(i-1).getText();
            	  String str2=list.get(i).getText();
            	  if(str2.compareToIgnoreCase(str1)<0)
            	  {
            		  order=false;
            		  break;
            	  }
              }
              if(order)
              {
            	  System.out.println("values are in order ,Test pass");
              }else
              {
            	  System.out.println("values are not in order,Test Fail");
              }
	}

}
