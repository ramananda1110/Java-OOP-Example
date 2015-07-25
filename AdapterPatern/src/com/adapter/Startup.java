package com.adapter;

public class Startup {

	public static void main(String[] args) {
		CreaditCard cd = new CustomerAccount();
		cd.setAccount();
		System.out.println(cd.getDetails());
	}

}
