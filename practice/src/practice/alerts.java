package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
	public static void main (String args[])
			{
		System.setProperty("webdriver.chrome.driver","F:\\udemypractice\\practice\\src\\practice\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("ramitasambyallukykotwal");
		WebElement element=driver.findElement(By.xpath("//input[@value='Alert']"));
		element.click();
	Alert value=	driver.switchTo().alert();
String aleettext =	value.getText();
value.accept();
		
		
			}

}
