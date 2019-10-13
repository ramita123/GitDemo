package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

public class alaskaTimWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\udemypractice\\practice\\src\\practice\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.xpath("//a[@href='loadAjax()']")).click();
		WebDriverWait d=new WebDriverWait(driver,10);
		
		driver.findElement(By.xpath("div//[@id='results']")).getText();
	}

}
