package com.association;

public class Account {
	private String acNumber;
	private double balance;
	private String name;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void deposite(double amount) {
		balance += amount;
	}

	public String withdraw(double amount) {
		balance -= amount;
		return "done";
	}
}
