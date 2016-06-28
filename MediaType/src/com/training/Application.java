package com.training;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Book[] b = new Book[3];
		b[0] = new Book("headFirstJava",5,2);
		b[1] = new Book("Dark Kinght",4,9);
		b[2] = new Book("Disney",4,8);
		
		Dvd[] dv = new Dvd[3];
		dv[0] = new Dvd("Krish",7,2);
		dv[1] = new Dvd("MI5",4,9);
		dv[2] = new Dvd("PUB",8,8);
		
       
      // Book b = new Book("headFirstJava",5,2);
       //Dvd d = new Dvd("Krish",3,50);
       System.out.println("what you want");
       System.out.println("press 1 for books and 2 for dvd");
       Scanner sc =  new Scanner(System.in);
       int ch = sc.nextInt();
       
       if(ch==1)
       {
		for(Book v : b)
		System.out.println(v);
       }
       else
       {
       for(Book v : b)
   		System.out.println(v);
       }
      // System.out.println(dv);
	sc.close();
	}

}
