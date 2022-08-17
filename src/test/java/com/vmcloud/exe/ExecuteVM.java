package com.vmcloud.exe;

import java.util.Scanner;

import org.testng.annotations.Test;

import com.vmcloud.app.MainApp;

public class ExecuteVM {
	
	MainApp mapp = new MainApp();
	
	
	/*
	 * @Test public void CheckVM() { Scanner sc= new Scanner(System.in); //System.in
	 * is a standard input stream System.out.print("Enter your Choice- ");
	 * 
	 * int InputNumber= sc.nextInt();
	 * 
	 * mapp.VMMenu(InputNumber);
	 * 
	 * }
	 */
	
	
	@Test (priority=1)
	public void TestVMCheckout()
	{		
		mapp.VMMenu(1);		
	}
	
	@Test (priority=2)
	public void TestVMCheckIn()
	{		
		mapp.VMMenu(2);		
	}

	
	

}
