package com.sampleprograms;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ItemPresentDDL {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D://commonjarFiles//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://Primusbank.qedgetech.com");
		
		Select clist=new Select(driver.findElement(By.id("drlist")));
		List<WebElement> list=clist.getOptions();
		System.out.println(list.size());
		
		String expval="Habsiguda";
		boolean brexist=false;
		for(int i=1;i<list.size();i++)
		{
			String actval= list.get(i).getText();
			if(expval.equalsIgnoreCase(actval))
			{
				brexist =true;
				break;
			}
		}
		if(brexist)       // here we are not using ! symbol, why don't know
		{
			System.out.println(expval+"is present in the list,Test Pass");
		}else
		{
			System.out.println(expval+"is not preseent in the list,Test Fail");
		}
		

        	}

}
