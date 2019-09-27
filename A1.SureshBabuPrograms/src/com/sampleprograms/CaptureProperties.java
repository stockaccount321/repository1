package com.sampleprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.DriverFactory;

public class CaptureProperties {

	public static void main(String[] args) throws Throwable {

        System.setProperty("webdriver.chrome.driver", "D:\\CommonJarFiles\\chromedriver.exe");    
        WebDriver driver=new ChromeDriver();
        driver.get("http://orangehrm.qedgetech.com");
        Thread.sleep(2000);
        
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
        Thread.sleep(2000);
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.linkText("PIM")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Add Employee")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("firstName")).sendKeys("A111");
        driver.findElement(By.id("middleName")).sendKeys("B221");
        driver.findElement(By.id("lastName")).sendKeys("C331");
        Thread.sleep(2000);
        
       String empno= driver.findElement(By.id("employeeId")).getAttribute("value");
       System.out.println(empno);
       Thread.sleep(3000);
       driver.findElement(By.id("employeeId")).clear();
       

	}

}
