package com.training;

public class Book extends Media {
	
	private int volumeNumber;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String title, int rating,int volumeNumber) {
		super(title, rating);
		// TODO Auto-generated constructor stub
		setVolumeNumver(volumeNumber);
	}

	public int getVolumeNumver() {
		return volumeNumber;
	}

	public void setVolumeNumver(int volumeNumver) {
		this.volumeNumber = volumeNumver;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+":"+this.volumeNumber;
		//	return super.toString()+":"+this.bookNumber+":"+this.bookName+":"+this.price;	
	}
	

}
