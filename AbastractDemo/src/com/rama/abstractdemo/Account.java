package com.rama.abstractdemo;

public abstract class Account {

	private String acNumber;
	private double balance;

	public String getAcNumber() {
		return acNumber;
	}

	public void setAcNumber(String acNumber) {
		this.acNumber = acNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposite(double amount) {
		balance += amount;
	}

	public abstract String withdraw(double amount);
}
