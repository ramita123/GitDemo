package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hackerRank {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\udemypractice\\practice\\src\\practice\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hackerrank.com/domains/java");
		/*int sizevalue=driver.findElements(By.xpath("//ul[@class='footer-links']/li/a")).size();
		System.out.println(sizevalue);
		for(int i=0;i<11;i++)
		{
			String linkname=driver.findElements(By.xpath("//ul[@class='footer-links']/li/a")).get(i).getAttribute("href");
			System.out.println(linkname);
			driver.navigate().to(linkname);
			driver.navigate().back();
		}
*/		
	int size=	driver.findElements(By.xpath("//ul[@class='nav-links']/li/a")).size();
	System.out.println(size);
	for(int i=1;i<5;i++)
	{
		String link=driver.findElements(By.xpath("//ul[@class='nav-links']/li/a")).get(i).getAttribute("href");
		System.out.println(link);
		driver.navigate().to(link);
		driver.navigate().back();
		
	}
	}

}
