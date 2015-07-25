package com.methodoverloding;

public class CheckingAccount extends Account {
	private double serviceCharge;

	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	@Override
	public void deposite(double amount) {
		if (amount > 1000) {
			super.deposite(amount);
		}
	}
}
