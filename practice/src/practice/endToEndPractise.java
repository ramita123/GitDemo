package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class endToEndPractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","F:\\udemypractice\\datadriven\\src\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php#");
		
		
		//wants to get the count of links only in first column
	int count=	driver.findElements(By.xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']/table/tbody/tr/td[1]/ul/li")).size();
	System.out.println(count);
	for(int i=1;i<count;i++)
	{
		String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElements(By.xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']/table/tbody/tr/td[1]/ul/li/a")).get(i).sendKeys(clickonlinkTab);
		Thread.sleep(5000L);
	}
		Set <String> childWindows=driver.getWindowHandles();
		System.out.println(childWindows);
		Iterator<String> it=childWindows.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	
		
	}
	}


