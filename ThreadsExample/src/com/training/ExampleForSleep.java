package com.training;

public class ExampleForSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			System.out.println("SBBB");
			Thread.sleep(600);
			
			System.out.println("Sapient");
			Thread.sleep(600);
			
			System.out.println("good");
			Thread.sleep(600);
			
			System.out.println("batch");
			Thread.sleep(600);
			
			System.out.println("B !!!!!!!!!!!!!");
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}

	}

}
