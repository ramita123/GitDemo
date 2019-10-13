package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingcalanderUI {
	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\udemypractice\\datadriven\\src\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		//parent child traverse rlation
		
	/*String text=	driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class='datepicker-switch']")).getText();
	System.out.println(text);*/
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class='datepicker-switch']")).getText().contains("May"))
		{
			driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class='next']")).click();
		}
	
		
		
		
	int count=	driver.findElements(By.xpath("//div[@class='datepicker-days']/table/tbody/tr/td")).size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		String text=driver.findElements(By.xpath("//div[@class='datepicker-days']/table/tbody/tr/td")).get(i).getText();
		if(text.equals("15"))
		{
			driver.findElements( By.xpath("//div[@class='datepicker-days']/table/tbody/tr/td")).get(i).click();
			break;
			
		}
		

		

	}
	}}


         



