package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {
	
	
	@Test
	public void MobileCarLoan(){
		System.out.println("MobileCarLoan");
		
	}
	@Test(groups= {"web"},dataProvider="getdata")
	public void WebCarLoan(String s0,String s1,String s2){
		System.out.println(s0+s1+s2);
	}
	@Test
	public void APICarLoan(){
		System.out.println("APICarLoan");
	}
	
	@DataProvider
	public Object[][] getdata(){
		
		Object[][] data=new Object[2][3];
		
		data[0][0]="Hi";
		data[0][1]="this";
		//data[0][2]=null;
		data[1][0]="is";data[1][1]="mohit";
		
		
		return data;
		
	}

}
