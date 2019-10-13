package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\udemypractice\\practice\\src\\practice\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mum");
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("bihar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);*/
		
		//checkboxexercise
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		driver.findElement(By.xpath("//input[@value='option2']")).click();
		driver.findElement(By.xpath("//input[@value='option3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		driver.findElement(By.xpath("//input[@value='option2']")).click();
		driver.findElement(By.xpath("//input[@value='option3']")).click();
	int count=	driver.findElements(By.xpath("//div[@id='checkbox-example']//label")).size();
	System.out.println(count);
		
		
		
		
		
	}

}
//*[@id="checkbox-example"]