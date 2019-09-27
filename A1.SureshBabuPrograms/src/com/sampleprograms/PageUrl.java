package com.sampleprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageUrl {

	public static void main(String[] args) throws InterruptedException {
		
            System.setProperty("webdriver.chrome.driver", "D:\\CommonJarFiles\\chromedriver.exe");
            WebDriver driver= new ChromeDriver();
            
            driver.get("http://wwww.Google.com");
      
            driver.findElement(By.linkText("Gmail")).click();
            Thread.sleep(2000);
            String pgurl=driver.getCurrentUrl();
            System.out.println(pgurl);
            if(pgurl.contains("gmail"))
            {
            	System.out.println("test pass");
            }else
            {
            	
            	System.out.println("test fail");
            }
	}
}
