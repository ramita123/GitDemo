package testobject;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectRepository.latestAnnuncement;

public class allTest extends latestAnnuncement {

	allTest() throws IOException {
		super();
		
	}
	
	
	  @BeforeTest 
	  public void launchBrowser()
	  { browser(); }
	  
	  @Test
	  public void logintest() 
	  { login(); }
	 
}
