package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class commonMethod {
	
	WebDriver driver;
public 	Properties prop=null;
	
	
	public  commonMethod() throws IOException 
	{
		prop=new Properties();
		FileInputStream file=new FileInputStream("F:\\udemypractice\\pageObject\\config.properties");
		System.out.println(file);
		prop.load(file);
		
				
	}
	
	public void openBroweser()
	{	String path=prop.getProperty("driverPath");
	System.out.println(path);
		System.setProperty("webdriver.chrome.driver",path);
		driver=new ChromeDriver();
		String blink=prop.getProperty("link");
		System.out.println(blink);
		driver.get(blink);
	}

public void sendData(String emailElement) 
		{		String str[]=emailElement.split("###");
		for(String sb:str)
		{
			System.out.println(sb);
		}
		
			
			driver.findElement(By.xpath(str[0])).sendKeys(str[1]);	
		}
	public void click(String clickData)
	{
		String sb[]=clickData.split("###");
	for(String str:sb)
	{
		System.out.println(str);
	}
		
		
		driver.findElement(By.xpath(sb[0])).click();
	}



}


