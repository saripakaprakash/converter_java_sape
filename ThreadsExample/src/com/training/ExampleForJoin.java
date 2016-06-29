package com.training;

public class ExampleForJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                   System.out.println("Main Starting");
                   
                      Thread info =  new ReadInfo();
                      
                      info.start();
                      
                     try {
                    	// System.out.println("interrupted"+info.isInterrupted());
                    	 info.join();	
					} catch (InterruptedException e ) {
						// TODO: handle exception
					    e.printStackTrace();
					}
                                
                    
                     System.out.println(info.isAlive());
                   System.out.println("Main Finish");
	}

}
