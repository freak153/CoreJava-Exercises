package com.loan;

public class Loan {

	private double principalAmount;
	private double duration;
	private int cibilScore;
	private double rateOfInterest;
	
	public Loan() {
		super();
		
	}
	public Loan(double amount, double duration, int cibilRate) {
		super();
		this.principalAmount = amount;
		this.duration = duration;
		this.cibilScore = cibilRate;
	}
	public double getPrincipalAmount() {
		return principalAmount;
	}
	public void setPrincipalAmount(double amount) {
		this.principalAmount = amount;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public int getCibilRate() {
		return cibilScore;
	}
	public void setCibilRate(int cibilRate) {
		this.cibilScore = cibilRate;
	}
	public double getRateOfInterest() {
		
		return rateOfInterest;
	}
	
	public double findRateOfInterest(int cibilScore ) {
		
		if(cibilScore>500) {
			rateOfInterest=7.5;
		}else {
			rateOfInterest=8.2;
		}
		
		return rateOfInterest;
	}
	
}
