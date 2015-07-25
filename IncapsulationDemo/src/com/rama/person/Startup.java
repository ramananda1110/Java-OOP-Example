package com.rama.person;

public class Startup {
	
	public static void main(String[] args) {
		Account ac1 = new Account();
		ac1.setName("M");
		
		ac1.deposite(8000);
		ac1.withdraw(3000);
		// ac1.balance=998832;
		
		System.out.println(ac1.getName());
		System.out.println(ac1.getBalance());
	}
}
