package selenium.operators.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Placeholder {
	@Test
	public  void login() throws Exception
	{
		// TODO Auto-generated method stub
		
		try {
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\nCodeIt\\chromedriver_win32\\chromedriver.exe");
			
	        WebDriver d=new ChromeDriver();
	        
	        d.get("http://magnus2.jalatechnologies.com");
	        d.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul[1]/li[2]/a")).click();
	        WebElement firstName = d.findElement(By.id("txtname"));
	        firstName.sendKeys("admin");
	        String value = firstName.getText();
	        String value1 = firstName.getAttribute(value);
	        
	        System.out.println(value);
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}
}
