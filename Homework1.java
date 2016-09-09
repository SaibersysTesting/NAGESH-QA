package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework1 {

	
	public static void main(String[] args) {
		
		System.out.println("mycontactform");
		Login();
		
     
	}
	public static void Login()
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
		
		
		
		driver.findElement(By.xpath(".//a[@href='http://www.mycontactform.com/how.php']")).click();
        String strTitle3 = driver.getTitle();
        System.out.println(strTitle3);
        assertTrue(strTitle3.contains("Pricing Information"));
        String strPricetabValue = driver.findElement(By.xpath(".//*[@id='header']/ul/li/span[text()='Pricing']")).getAttribute("class");
		assertTrue((strPricetabValue.compareTo("highlighttab"))== 0);
		
		
		driver.findElement(By.xpath(".//a[@href='http://www.mycontactform.com/features.php']")).click();
        String strTitle4 = driver.getTitle();
        System.out.println(strTitle4);
        assertTrue(strTitle4.contains("Complete Features"));
        String strFeaturestabValue = driver.findElement(By.xpath(".//*[@id='header']/ul/li/span[text()='Features']")).getAttribute("class");
        assertTrue((strFeaturestabValue.compareTo("highlighttab"))==0);
	
       
		
        driver.findElement(By.xpath(".//*[text()='About Us']")).click();
        String strTitle5 = driver.getTitle();
        System.out.println(strTitle5);
        assertTrue(strTitle5.contains("About Us"));
        String strAbouttabValue = driver.findElement(By.xpath(".//*[@id='header']/ul/li/span[text()='About Us']")).getAttribute("class");
        assertTrue((strAbouttabValue.compareTo("highlighttab"))==0);
	
        driver.findElement(By.xpath(".//a[@href='http://www.mycontactform.com/help.php']")).click();
        String strTitle6 = driver.getTitle();
        System.out.println(strTitle6);
        assertTrue(strTitle6.contains("Help"));
        String strHelptabValue = driver.findElement(By.xpath(".//*[@id='header']/ul/li/span")).getAttribute("class");
        assertTrue((strHelptabValue.compareTo("highlighttab"))==0);
		
        
        
        driver.findElement(By.xpath(".//a[@href='http://www.mycontactform.com/resources.php']")).click();
        String strTitle7 = driver.getTitle();
        System.out.println(strTitle7);
        assertTrue(strTitle7.contains("Webmaster Resources"));
        String strResourcestabValue = driver.findElement(By.xpath(".//*[@id='header']/ul/li/span[text()='Resources']")).getAttribute("class");
        assertTrue((strResourcestabValue.compareTo("highlighttab"))==0);
	
	
		
	}
	private static void assertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}
}
		
		
		
	


