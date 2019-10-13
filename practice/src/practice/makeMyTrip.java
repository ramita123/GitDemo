package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class makeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\udemypractice\\practice\\src\\practice\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).click();
	//source.clear();
	source.sendKeys("DEL");
	source.sendKeys(Keys.ENTER);*/
		driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
		/*WebElement confirm=driver.findElement(By.xpath("//input[@value='Confirmation Alert']"));
		confirm.click();
		Alert confirm1= driver.switchTo().alert();
		System.out.println(confirm1.getText());	
		confirm1.accept();*/
		driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
		Alert prompt=driver.switchTo().alert();
		Thread.sleep(2000);
		prompt.sendKeys("hey m goint toaccept");
		prompt.accept();
	}

}
