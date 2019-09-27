package com.sampleprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDLOperations {

	public static void main(String[] args) throws Throwable {

         System.setProperty("webdriver.chrome.driver", "D:\\CommonJarFiles\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         Thread.sleep(3000);
         driver.get("http://www.facebook.com");
         Thread.sleep(3000);
         
         Select dlist=new Select(driver.findElement(By.id("day")));
         dlist.selectByIndex(26);
         Select mlist =new Select(driver.findElement(By.id("month")));
         mlist.selectByValue("8");
         Select ylist=new Select(driver.findElement(By.id("year")));
         ylist.selectByVisibleText("2019");
        
	}

}
