package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static  void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\udemypractice\\datadriven\\src\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String sheetPath=System.getProperty("user.dir")+"\\src\\datadriven\\excelsheet.xlsx";
		System.out.println(sheetPath);
		Xls_Reader xlr = new Xls_Reader(sheetPath);
		//get row count
		int rowCount=xlr.getRowCount("Sheet1");
		System.out.println(rowCount);
		//get column count
		
		int colCount=xlr.getColumnCount("Sheet1");
		System.out.println(colCount);
		for(int i=2;i<=rowCount;i++)
		{
		String Vrun= xlr.getCellData("Sheet1", "RUN", i);
		System.out.println(Vrun);
		if(Vrun.equalsIgnoreCase("on"))	
		{
			String vtc_id=xlr.getCellData("Sheet1","tc_id",i);
			String vtestCase=xlr.getCellData("Sheet1","tc_testcase",i);
			String vpara1 =xlr.getCellData("Sheet1", "para1", i);
			String vpara2=xlr.getCellData("Sheet1", "para2", i);
			
			switch(vtc_id)
			{
				case "tc_001":
					String actualUrl=driver.getCurrentUrl();
					if(vpara1.equals(actualUrl))
					{
						System.out.println("pass");
						xlr.setCellData("Sheet1","status",i,"pass");
					}
					else
					{
						System.out.println("fail");
						xlr.setCellData("Sheet1","status",i,"fail");
					}
					break;
				case "tc_002":
					driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(vpara1);
					
					driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(vpara2);
					driver.findElement(By.xpath("//input[@type='submit']")).click();
					boolean trueValue=driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed();
					System.out.println(trueValue);
					if(trueValue==true)
					{
						System.out.println("pass");
						xlr.setCellData("Sheet1","status",i,"pass");
					}
					else
					{
						System.out.println("fail");
						xlr.setCellData("Sheet1","status",i,"fail");
					}
					break;
						
				
			}
		}
		

		}
}
}
