package com.training;

public class PrintString {

	
	synchronized public static void print(String str1,String str2)
	{
		System.out.println(str1);
		
		try{
			Thread.sleep(200);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(str2);
	}
	
	
}
