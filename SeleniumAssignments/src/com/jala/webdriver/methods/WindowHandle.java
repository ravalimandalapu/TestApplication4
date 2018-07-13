package com.jala.webdriver.methods;


	
	

	import java.util.Iterator;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class WindowHandle {

	

		public static void main(String[] args) {
			
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\nCodeIt\\chromedriver_win32\\chromedriver.exe");
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://magnus2.jalatechnologies.com/");
			System.out.println(driver.getWindowHandles());
			driver.findElement(By.xpath("//a[@href='Admin.aspx']")).click();
			driver.findElement(By.xpath("//input[@id='txtname']")).clear();
			driver.findElement(By.xpath("//input[@id='txtname']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@id='txtpsw']")).clear();
			driver.findElement(By.xpath("//input[@id='txtpsw']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@id='btnlogin']")).click();
			
			driver.findElement(By.linkText("More")).click();
			 driver.findElement(By.linkText("Popups")).click();
			 driver.findElement(By.linkText("Popup One")).click();
			 Set<String> allWindows=driver.getWindowHandles();
			 Iterator<String> itr=allWindows.iterator();
			 String mainWindows=itr.next();
			 String popupWindow=itr.next();
			 System.out.println(driver.getWindowHandle());
			 
			 driver.switchTo().window(popupWindow);
		// get the title of current window
			 System.out.println(driver.getTitle());
			 driver.close();
			 driver.switchTo().window(mainWindows);
			 
			 
			
			 
		}

	}



