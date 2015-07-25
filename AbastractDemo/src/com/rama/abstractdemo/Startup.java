package com.rama.abstractdemo;

public class Startup {
	public static void main(String[] args) {
		Saving ac1 = new Saving();
		ac1.setAcNumber("stur-47888");
		ac1.setBalance(4000);
		System.out.println("balance :" + ac1.getBalance());

		ac1.deposite(1000);
		ac1.deposite(6000);
		// not deposited 400<500
		ac1.deposite(400);
		ac1.deposite(1000);
		System.out.println("after deposite balance :" + ac1.getBalance());
		ac1.withdraw(5000);
		System.out.println("after withdraw balance :" + ac1.getBalance());
	}
}
