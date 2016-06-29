package com.training;

public class SecondThread implements Runnable {

	public SecondThread() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
for(int i=0;i<=10;i++){
			
			System.out.println("Current Thread :="+Thread.currentThread().getName());
			System.out.println(i);
		}

	}

	
}
