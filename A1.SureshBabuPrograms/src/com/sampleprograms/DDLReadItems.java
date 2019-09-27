package com.sampleprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDLReadItems {

	public static void main(String[] args) {

         System.setProperty("webdriver.chrome.driver", "D://commonjarFiles//chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("D:\\CarList.html");
         
         Select clist= new Select(driver.findElement(By.id("Car Multiples")));
         List<WebElement> list= clist.getOptions();
         System.out.println(list.size());
         for(int i=0;i<=list.size();i++)
         {
        	 String liname= list.get(i).getText();
        	 System.out.println(liname);
         }
         
	}

}
