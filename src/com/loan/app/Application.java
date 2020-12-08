package com.loan.app;

import com.loan.HousingLoan;

public class Application {

	public static void main(String[] args) {
		
		HousingLoan messhy=new HousingLoan(1000,2,400);
		System.out.println("Principal Amount: "+messhy.getPrincipalAmount());
		System.out.println("Duration in yrs "+messhy.getDuration());
		System.out.println("CibilScore: "+messhy.getCibilRate());
		System.out.println("Rate of Interest: "+messhy.findRateOfInterest(messhy.getCibilRate()));
		System.out.println("Simple Interest: "+messhy.getSimpleInterst());
		System.out.println("Amount: "+messhy.getAmount());
		System.out.println("----");
	}

}
