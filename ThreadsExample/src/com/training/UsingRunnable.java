package com.training;

public class UsingRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Runnable runnable = new SecondThread();
		
		Thread thread1 = new Thread(runnable,"Suresh");
		Thread thread2 = new Thread(runnable,"Rakesh");
		Thread thread3 = new Thread(runnable,"ramesh");
	
	      thread1.start();
	      thread2.start();
	      thread3.start();
	}

}
