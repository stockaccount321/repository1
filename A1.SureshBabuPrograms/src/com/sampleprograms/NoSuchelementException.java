package com.sampleprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchelementException {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\CommonJarFiles\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.PrimusBank.qedgetech.com");
		driver.findElement(By.linkText("Site Map")).click();
		driver.findElement(By.linkText("Home")).click();
	    driver.findElement(By.linkText("Demo")).click();
		driver.close();

	}

}
