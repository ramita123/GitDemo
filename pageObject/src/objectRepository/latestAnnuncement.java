package objectRepository;

import java.io.IOException;

import utility.commonMethod;

public class latestAnnuncement extends commonMethod {
	
	
	public latestAnnuncement() throws IOException {
		super();
		
	}
	
	public void browser()
	{
		openBroweser();
	}

	public void login()
	{	
		
		String locValue=prop.getProperty("xpath");
		
		System.out.println("check");
		sendData(locValue);
		
		
		System.out.println("checkagain");
		String password=prop.getProperty("pass");
		sendData(password);
		System.out.println(password);
		
		System.out.println("checkthrd time");
		String logButton=prop.getProperty("login");
		System.out.println(logButton);
		click(logButton);
	}
	
	
	
	
	
	

}
