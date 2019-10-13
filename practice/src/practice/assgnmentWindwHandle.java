package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assgnmentWindwHandle {
	public static void main (String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\udemypractice\\practice\\src\\practice\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		Set <String> ids=driver.getWindowHandles();
		System.out.println(ids);
		Iterator <String> itr= ids.iterator();
		String parentId= itr.next();
		String childId = itr.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		
	}

}
