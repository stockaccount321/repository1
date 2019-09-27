package com.sampleprograms;

import org.bouncycastle.asn1.pkcs.Pfx;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "D:\\\\CommonJarFiles\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.linkText("Gmail")).click();
		
	    /* String pgtitle=driver.getTitle();
		System.out.println(pgtitle);
		if (pgtitle.contains("Images"))
		{
			System.out.println("Test Pass");
		}else
		{
		System.out.println("test fail");
			
		}*/
		String pgurl= driver.getCurrentUrl();
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
