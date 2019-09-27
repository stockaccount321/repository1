package com.sampleprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLoginFunctionality {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D://commonjarFiles//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	  	driver.get("http://orangehrm.qedgetech.com/");
	    Thread.sleep(3000);
	    
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		  Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		  Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
		  Thread.sleep(2000);
		
		if(driver.findElement(By.partialLinkText("Welcome")).isDisplayed())
		{
			System.out.println("AdminLogin Test Pass");
		}else
		{
			System.out.println("Adminlogin Test Fail");
		}
	}

}
