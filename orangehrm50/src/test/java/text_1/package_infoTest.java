package text_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import A1_Day2.NewTest_Addskills;

public class package_infoTest { 
	
 static WebDriver driver;
	
    @Test
public static void loginTest() throws Exception
		{

			package_infoTest T1 = new package_infoTest();
			
			package_infoTest.OpenChromeBroswer();
			package_infoTest.Login();
			package_infoTest.Addjobtitles();
			
		}
  
  
  
	  public static void OpenChromeBroswer() throws Exception
		{
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize() ;	
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
  
}
	  
	  public static void Login() throws Exception
		{
			findElement(By.id("txtUsername")).sendKeys("Admin");
			findElement(By.id("txtPassword")).sendKeys("admin123");
			findElement(By.id("btnLogin")).click();
}
	  
	  
	  public static void Addjobtitles() throws Exception
		{
			findElement(By.id("menu_admin_viewAdminModule")).click();
			findElement(By.id("menu_admin_Job")).click();
			findElement(By.id("menu_admin_viewJobTitleList")).click();
			findElement(By.id("btnAdd")).click();
			findElement(By.id("jobTitle_jobTitle")).sendKeys("test engineer");
			findElement(By.id("jobTitle_jobDescription")).sendKeys("test engineer descr");
	  
	  
	  }
	  
	  
	  
	  
	  public  static WebElement findElement(By by) throws Exception 
		{

			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
			
		}
			
		}
			
