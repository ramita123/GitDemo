package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class mislenious {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\udemypractice\\datadriven\\src\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType .FILE);
		FileUtils.copyFile(src,new File("C:\\ramita\\screenshot.jpg"));

	}

}
  