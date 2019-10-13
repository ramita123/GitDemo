package testngDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 extends proertiesDemo {
	static WebDriver driver;
	@Test
	public void beforelogin() throws IOException
	{
		property();
		/*System.setProperty("webdriver.chrome.driver","F:\\udemypractice\\practice\\src\\testngDemo\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");*/
	}
	/*@Test(groups= {"smoke"})
	public void webLogion()
	{
		System.out.println("weblogion");
	}
	@Parameters({"url","username"})
	@Test(priority=2)
	public void mobileLogin(String uName, String key)
	{  
		System.out.println("mobilelogion");
		System.out.println(uName);
		System.out.println(key);
		
	}
	@Test( groups = {"smoke"})
	public void mobileLogout()
	{
		System.out.println("mobilelogout");
	}*/
	
	@Test(dataProvider="getData")
	public void mobilesinup(String username, String password)
	{
		System.out.println("mobilesignup");
		System.out.println(username);
		System.out.println(password);

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	/*@Test(priority=3)
	public void mobileProfile()
	{
		System.out.println("mobileprofile");
	}
	@Test(priority=4)
	public void mobileChangePassword()
	{
		System.out.println("changepassword");
	}
	@Test(priority=5)
	public void mobileHomePage()
	{
		System.out.println("homepage");
	}
	@Test(priority=6)
	public void mobileHistory()
	{
		System.out.println("history");
	}
	@Test(priority=7)
	public void mobileAppointments()
	{
		System.out.println("appouintments");
	}
	@Test(priority=9)
	public void mobilePayements()
	{
		System.out.println("payements");
	}
	*/
	
	@Test(priority=10)
	public void apiLogion()
	{
		System.out.println("apilogion");
	}
	@DataProvider
	 public  Object[][] getData()
	 {
		 Object[] [] data=new Object[5][2];
		 data[0][0]="ramitasambyal";
		 data[0][1]="ramita123";
		 
		 //set 2
		 data[1][0]="arjunsambyal";
		 data[1][1]="arjunsam";
		 //set 3
		 data[2][0]="anjalisambyal@gmail.com";
		 data[2][1]="abc@123";
		 //set4
		 data[3][0]="tanu@yopmail.com";
		 data[3][1]="abc@123";
		 //set 5
		 data[4][0]="madhu@yopmail.com";
		 data[4][1]="abc@123456";
		 return data;
	 }

}
