package locators;

import org.openqa.selenium.By;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="xpath";
		String b = "//input[@id='email']";
		 By sum=locators( a,  b);
		 System.out.println(sum);

	}
	
	/*
	 * public static By locators(String x, String y) { By by = null; switch(x) {
	 * 
	 * case "xpath" : by=By.xpath(y); break;
	 * 
	 * 
	 * 
	 * } return by;
	 * 
	 * }
	 */

	public static By locators(String x,String y)//instance method
	{	By by =null;
		switch(x)
		{
		case "id":
			by = By.id(y);
			break;
		case "name":
			by=By.name(y);
			break;
			
		case "linkText":
			by=By.linkText(y);
			break;
			
		case "partialLinkText":
			by=By.partialLinkText(y);
			break;
			
		case "xpath":
			by=By.xpath(y);
			break;
		case "tagname":
			by=By.tagName(y);
			break;
		case "classname":
			by=By.className(y);
			break;
		case "cssSelector":
			by=By.cssSelector(y);
			break;
			
			
}
		return by;
	}
}
