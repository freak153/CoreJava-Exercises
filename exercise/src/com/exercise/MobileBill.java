package com.exercise;

import java.util.HashMap; 


public class MobileBill {

	private String customerName;
	private String mobileNumber;
	private String planName;
	private double amount;
	static String serviceProvider="JIO";
	
	HashMap<String, Integer> planAmount = new HashMap<String, Integer>();
	
	public void setPlan() {
		planAmount.put("basic", 500);
		planAmount.put("swift", 700);
		planAmount.put("blaze", 1000);
	}
	
	public MobileBill(String customerName, String mobileNumber) {
		super();
		setPlan();
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.planName="basic";
	}

	public MobileBill(String customerName, String mobileNumber, String planName) {
		super();
		setPlan();
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.planName = planName;
		
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public double getAmount() {
		this.amount=planAmount.get(planName);		
		return this.amount;
	}

	
	
}
