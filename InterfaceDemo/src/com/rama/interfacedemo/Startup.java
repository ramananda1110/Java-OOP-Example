package com.rama.interfacedemo;

public class Startup {
	public static void main(String[] args) {
		Student st1 = new Student(12, "ramananda", "cserama");
		st1.getInfomation();
		Branch bn1 = new Branch("sarkar", "Dhaka");
		bn1.getInfomation();
		Employee emp1 = new Employee("Ahsu", "bkrcAhsu", "Mirpur");
		emp1.getInfomation();
	}
}
