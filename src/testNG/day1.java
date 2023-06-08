package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day1 {
	
	@Test
	public void MobilePersonalLoan(){
		System.out.println("MobilePersonalLoan");
		
	}
	@Test
	public void WebPersonalLoan(){
		System.out.println("WebPersonalLoan");
	}
	@AfterClass
	public void method1()
	{
		System.out.println("after day1");
	}
	@Test
	public void APIPersonalLoan(){
		System.out.println("APIPersonalLoan");
	}

}
