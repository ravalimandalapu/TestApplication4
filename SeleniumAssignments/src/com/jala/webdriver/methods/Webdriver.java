package com.jala.webdriver.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Webdriver {
	

	@Test
	public  void login() throws Exception
	{
		// TODO Auto-generated method stub
		
		
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\nCodeIt\\chromedriver_win32\\chromedriver.exe");
			
	        WebDriver d=new ChromeDriver();
	      //using get method to open the url
	        
	         d.get("http://magnus2.jalatechnologies.com");
	        
	      // using getCurrentUrl method to get the currenturl
	          String currentUrl=d.getCurrentUrl();
	        
	          System.out.println(currentUrl);
	      // to get the title of  url
	          
	        System.out.println(d.getTitle());
	      // to get the page source of url
	        System.out.println(d.getPageSource());
		//hgduasygfdghifghdif
	        
	        d.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul[1]/li[2]/a")).click();
	        // switch to method used in web driver
	       // String myWindowHandle = d.getWindowHandle();
	      // d.switchTo().window(myWindowHandle );
	       // System.out.println(myWindowHandle);
	        d.switchTo().frame(d.findElement(By.xpath("//input[@id='more-tab']/div/div[1]/iframe")));
	        d.switchTo().frame(d.findElement(By.xpath("//input[@id='promo']/b[2]/a")));
	        
	        
	       
		
	}
}
