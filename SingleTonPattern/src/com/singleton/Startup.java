package com.singleton;

public class Startup {
public static void main(String[] args) {
	SingleTonObject obj1 = SingleTonObject.getInatance("Ramananda", "cserama.tpi@gmail.com", "Dhaka");
	
	System.out.println(obj1.getName());
	System.out.println(obj1.getAddress());
	
	SingleTonObject obj2 = SingleTonObject.getInatance("Ashu", "ashu.tpi@gmail.com", "Dhaka");
	System.out.println(obj2.getName());
	System.out.println(obj2.getEmail());
}
}
