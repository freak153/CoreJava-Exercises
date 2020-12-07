package com.exercise;

public class Application {

	public static void main(String[] args) {
		MobileBill bill=new MobileBill("Anvita","87907647");
		System.out.println("Name :"+bill.getCustomerName());
		System.out.println("Mobile Number :"+bill.getMobileNumber());
		System.out.println("Plan Name :"+bill.getPlanName());
		System.out.println("Bill Amount: "+bill.getAmount());

	}

}
