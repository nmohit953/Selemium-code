package testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	@Parameters({"URL"})
	
	@Test
	public void MobileHomeLoan(){
		System.out.println("MobileHomeLoan");
		
	}
	@Test(groups= {"web"})
	public void WebHomeLoan(){
		System.out.println("WebHomeLoan");
	}
	

	
	
	@Test
	public void APIHomeLoan(){
		System.out.println("APIHomeLoan");
	}

}
