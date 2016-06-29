package com.training;

public class ReadInfo extends Thread {
	
	public void run(){
		
		System.out.println(" Start Reading");
		        
		try {
			//System.out.println("interrupted"+Thread.currentThread().isInterrupted());
			System.out.println(this.isAlive());  
			System.in.read();     	
		} catch (Exception e) {
			// TODO: handle exception
		    e.printStackTrace();
		}
		
		
		
		
		System.out.println("Finished Reading");
	}

}
