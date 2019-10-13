package testdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing {
	WebDriver driver=null;

	public void openBroweser() throws IOException 
	{
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("F:\\udemypractice\\pageObject\\config.properties");
		System.out.println(file);
		prop.load(file);
		
				
		String path=prop.getProperty("driverPath");
	System.out.println(path);
		
		  System.setProperty("webdriver.chrome.driver",path);
		  driver=new ChromeDriver();
		   String blink=prop.getProperty("link"); 
		  driver.get(blink);
		 
	}



	public static void main(String[] args) throws IOException {
		testing obj=new testing();
		obj.openBroweser();
	}

}
