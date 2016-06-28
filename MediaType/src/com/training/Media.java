package com.training;

public abstract class Media {
	
	private String title;
	private int rating;
	public Media() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Media(String title, int rating) {
		super();
		this.title = title;
		this.rating = rating;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	} 
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.title+":"+this.rating;
		//	return super.toString()+":"+this.bookNumber+":"+this.bookName+":"+this.price;	
	}
	

}
