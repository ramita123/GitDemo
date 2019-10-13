package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class interviewques {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\udemypractice\\practice\\src\\practice\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.spicejet.com/Default.aspx");
	/*driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	driver.findElement(By.xpath("//div[@id='divAdult']/div[2]/span[3]")).click();
	driver.findElement(By.xpath("//input[@value='Done']")).click();*/
	/*driver.findElement(By.xpath("//input[@value='Departure City']")).click();
	driver.findElement(By.xpath("//a[@value='DHM']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("(//a[@value='PNQ'])[2]")).click();
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PNQ']")).click();//praent child relation
	*/
	//remember this instead of this you can use parrent child relation.
	/*Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='flightSearchContainer']/div[4]/button")).click();
	driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[4]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='Div1']/button")).click();
	driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[2]/table/tbody/tr[1]/td[1]/a")).click();
	driver.findElemnet()
	driver.findElement(By.xpath("//"));*/
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
	
	}
	}
//*[@id="flightSearchContainer"]/div[4]/button  
//*[@id="ui-datepicker-div"]/div[1]/table/tbody/tr[4]/td[4]/a
//*[@id="Div1"]/button
//*[@id="ui-datepicker-div"]/div[2]/table/tbody/tr[1]/td[1]/a