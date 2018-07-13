 



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\nCodeIt\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://magnus2.jalatechnologies.com/");
		driver.findElement(By.xpath("//a[@href='Admin.aspx']")).click();
		driver.findElement(By.xpath("//input[@id='txtname']")).clear();
		driver.findElement(By.xpath("//input[@id='txtname']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtpsw']")).clear();
		driver.findElement(By.xpath("//input[@id='txtpsw']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='btnlogin']")).click();
		
		driver.findElement(By.linkText("More")).click();

		
		driver.findElement(By.xpath("//a[@href='links.aspx']")).click();	

		driver.findElement(By.xpath("//a[@href='#c']")).click();
		System.out.println("8.passed");
	
		 driver.findElement(By.xpath("//img[@title='Growic Link']")).getAttribute("value");
		System.out.println("9.passed");
		driver.findElement(By.xpath("//img[@title='Linkedin Link']")).getAttribute("src");
		System.out.println("10.passed");
	    driver.findElement(By.xpath("//img[@title='Goggle Link']")).getAttribute("src");
		System.out.println("11.passed");
		driver.findElement(By.xpath("//img[@title='Webmail Link']")).getAttribute("src");
		System.out.println("12.passed");
		

	}

}
