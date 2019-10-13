package testngDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class proertiesDemo {
	public WebDriver driver=null;
	public Properties prop=null;
	/*public static void main (String[] args) throws IOException
			{
		
			proertiesDemo demo=new proertiesDemo();
			demo.property();
			demo.openBrowser();
		}*/
	@Test
	public void property() throws IOException 
	{
		 prop=new Properties();
		FileInputStream file=new FileInputStream("F:\\udemypractice\\practice\\src\\testngDemo\\demo.properties");
		prop.load(file);
	
	
	
		//String path=prop.getProperty("driverPath");
	//System.out.println(path);
		System.setProperty("webdriver.chrome.driver","F:\\\\udemypractice\\\\practice\\\\src\\\\testngDemo\\\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(prop.getProperty("userName"));
	

	}	


}
