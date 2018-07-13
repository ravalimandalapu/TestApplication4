package com.jala.webdriver.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands{
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\nCodeIt\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://magnus2.jalatechnologies.com/");
		driver.manage().window().maximize(); 
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandles());
		
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize(); 
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandles());
		System.out.println(driver.getClass());
		
		
		
		
		driver.navigate().refresh();
		driver.close();

	}

}


