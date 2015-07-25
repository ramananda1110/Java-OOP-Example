package com.methodoverloding;

public class SavingsAccount extends Account {

	private double interestAmount;

	public double getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(double interestAmount) {
		this.interestAmount = interestAmount;
	}

	@Override
	public void withdraw(double amount) {
		if (getBalance() - amount > 0) {
			super.withdraw(amount);
		}

	}
	
	

}
