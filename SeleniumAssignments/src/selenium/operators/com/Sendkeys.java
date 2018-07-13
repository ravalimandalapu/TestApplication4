package selenium.operators.com;



	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
	public class Sendkeys {

		

		
		public  class SendKeys {
			public WebDriver driver;
			@Test
			public  void loginFacebook() throws Exception
			{
				// TODO Auto-generated method stub
				
				try {
					WebDriver driver;
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\nCodeIt\\chromedriver_win32\\chromedriver.exe");
					
			        WebDriver d=new ChromeDriver();
			        
			        d.get("http://www.facebook.com");
			        d.findElement(By.name("email")).sendKeys("ravalimandalapu849@gmail.com");
			        d.findElement(By.name("pass")).sendKeys("");
			        d.findElement(By.id("u_0_2")).click();
			    }
			        catch(Exception e)
			        {
			            System.out.println(e);
			        }


			}
		}
		}

