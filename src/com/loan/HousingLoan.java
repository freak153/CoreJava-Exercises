package com.loan;

public class HousingLoan extends Loan {

	private double simpleInterest;
	private double amount;

	public HousingLoan() {
		super();
		
	}
	public HousingLoan(double amount, double duration, int cibilRate) {
		super(amount,duration,cibilRate);
	}

	public double getSimpleInterst() {
		
		this.simpleInterest=super.getPrincipalAmount()*super.getDuration()*super.findRateOfInterest(getCibilRate())*100;
		
		return this.simpleInterest;
	}

	public double getAmount() {
		this.amount=super.getPrincipalAmount()+this.simpleInterest;
		return this.amount;
	}

	

	
	
}
