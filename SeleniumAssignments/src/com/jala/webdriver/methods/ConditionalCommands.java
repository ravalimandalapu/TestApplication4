package com.jala.webdriver.methods;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {
	
	public static WebDriver driver;


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\nCodeIt\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.xpath(".//*[@id='email']"));
		WebElement password=driver.findElement(By.xpath(".//*[@id='pass']"));
		
		if(email.isDisplayed() && email.isEnabled())
		{
		  email.sendKeys("ravali2k18@@gmail");	
		}
		if(password.isDisplayed() && password.isEnabled())
		{
			password.sendKeys("apr191996");
		}
		//female
		System.out.println(driver.findElement(By.xpath(".//*[@id='u_0_9']")).isSelected());//false
		//male
		System.out.println(driver.findElement(By.xpath(".//*[@id='u_0_a']")).isSelected());//false
		// selects male radio button
		if(driver.findElement(By.xpath(".//*[@id='u_0_a']")).isSelected()==false)
		{
			driver.findElement(By.xpath(".//*[@id='u_0_a']")).click();
			
		}
	}

}
