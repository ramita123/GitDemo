package practice;





import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gamilWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\udemypractice\\practice\\src\\practice\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		/*driver.get("https://accounts.google.com/signin/v2/identifier?service=CPanel&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(@href,'https://support.google.com/chrome/answer/6130773?hl=en-GB')]")).click();
		Set <String> ids=driver.getWindowHandles();
		System.out.println(ids);
		Iterator<String> it =ids.iterator();
		String  parentid=it.next();
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());*/
			driver.get("https://support.google.com/mail/answer/56256?hl=en");
			driver.findElement(By.xpath("//a[@href='https://accounts.google.com/SignUp']/parent::li")).click();
			System.out.println(driver.getTitle());
		Set <String> ids=	driver.getWindowHandles();
		System.out.println(ids);
		Iterator <String>it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
	}

}
