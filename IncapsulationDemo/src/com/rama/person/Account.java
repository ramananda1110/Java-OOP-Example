package com.rama.person;

public class Account {
	private double balance;
	private String name;
	
	public void deposite(double amount){
		balance +=amount;
	}
	
	public void withdraw(double amount){
		balance -=amount;
	}

	public double getBalance() {
		return balance;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length()>2){
			this.name = name;
		}
	}
}
