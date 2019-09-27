package com.sampleprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggetionItems {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\CommonJarFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://www.cleartrip.com");
		driver.findElement(By.id("FromTag")).sendKeys("Hyd");
		driver.findElement(By.id("FromTag")).click();
		Thread.sleep(3000);
		List<WebElement> lists=driver.findElements(By.xpath("/html/body/ul[1]/li"));
		System.out.println(lists.size());
		for(int i=0; i<=lists.size();i++)
		{
			String liname= lists.get(i).getText();
			System.out.println(liname);
		}

	}

}
