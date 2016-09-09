package Practice;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework3 {

	public static void main(String[] args) throws InterruptedException {
	
			
			System.out.println("mycontactform");
			Login5();
		
	     
		}
		public static void Login5()throws InterruptedException
		{
			WebDriver driver= new FirefoxDriver();
			
			driver.get("http://www.mycontactform.com/");
			driver.manage().window().maximize();
			String strTitle = driver.getTitle();
			System.out.println(strTitle);
			assertTrue(strTitle.contains("myContactForm.com"));
			String strHometabValue = driver.findElement(By.xpath(".//*[@id='header']/ul/li/span[text()='Home']")).getAttribute("class");
			assertTrue((strHometabValue.compareTo("highlighttab"))== 0);
			
			driver.findElement(By.xpath(".//a[@href='http://www.mycontactform.com/samples.php']")).click();
	        String strTitle2 = driver.getTitle();
	        System.out.println(strTitle2);
	        assertTrue(strTitle2.contains("Sample Email Forms"));
	        String strSampletabValue = driver.findElement(By.xpath(".//*[@id='header']/ul/li/span[text()='Sample Forms']")).getAttribute("class");
			assertTrue((strSampletabValue.compareTo("highlighttab"))== 0);
			
			driver.findElement(By.xpath(".//*[@value='2']")).click();
			assertTrue(driver.findElement(By.xpath(".//*[@value='2']")).isSelected());
			 
			 
	        driver.findElement(By.xpath(".//*[@id='subject']")).sendKeys("AUTOMATION TESTING"); 
	        System.out.println(driver.findElement(By.xpath(".//*[@id='subject']")).getAttribute("value"));
	        
	        driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("naga.wills@gmail.com"); 
	        System.out.println(driver.findElement(By.xpath(".//*[@id='email']")).getAttribute("value"));
	        
	        
	        Select select = new Select(driver.findElement(By.id("q3")));
	         select.selectByVisibleText("Third Option");
	        System.out.println(driver.findElement(By.id("q3")).getAttribute("value"));
	        
	        driver.findElement(By.xpath(".//*[@id='q4' and@value='Fifth Option']")).click();
	        System.out.println(driver.findElement(By.xpath(".//*[@id='q4' and@value='Fifth Option']")).getAttribute("value"));
	        
			Thread.sleep(10000);
			
			driver.findElement(By.xpath(".//*[@value='Reset']")).click();
			System.out.println(driver.findElement(By.xpath(".//*[@value='Reset']")).getAttribute("value"));
		}

	}


