package com.rama.abstractdemo;

public class Saving extends Account {

	@Override
	public void deposite(double amount) {
		if (amount > 500) {
			setBalance(getBalance() + amount);
		}
	}

	@Override
	public String withdraw(double amount) {
		if(getBalance()-amount>0){
			setBalance(getBalance()-amount);
			return "done";
		}else{
			return "insufficient balance";
		}
	}
	
	public void m2(){
		
	}
}
