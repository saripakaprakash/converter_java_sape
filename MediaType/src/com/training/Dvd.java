package com.training;

public class Dvd extends Media{
          
	private int runningTime;

	public Dvd() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dvd(String title, int rating,int runningTime) {
		super(title, rating);
		// TODO Auto-generated constructor stub
		setRunningTime(runningTime);
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}

}



