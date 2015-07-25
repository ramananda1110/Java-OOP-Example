package com.rama.opp;


public class Startup {
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "rama";
		st1.email = "email";
		st1.phone = "23894-43";
		Student s2 = new Student();
		s2.name = "sdo";
		s2.email = "emoa";
		s2.phone = "pa";

		Student s3 = new Student();
		s3.name="WXy";
		s3.email="cserama.tpi@gmail.com";
		s3.phone="0830293";
		
		Department aDepartment = new Department();
		aDepartment.name="CSE";
		aDepartment.location="A bulding";
		aDepartment.students.add(st1);
		aDepartment.students.add(s2);
		
		for (Student sts : aDepartment.students) {
			
			System.out.println(sts.name);
			System.out.println(sts.email);
			System.out.println(sts.phone);
			System.out.println("");
		}
		
//		ArrayList<Student> sList = new ArrayList<Student>();
//		sList.add(st1);
//		sList.add(s2);
//		sList.add(s3);
//		
//		ArrayList<Student> students = new ArrayList<Student>();
//		
//		students.addAll(sList);
//		
//		for (Student sts : students) {
//			System.out.println(sts.name);
//			System.out.println(sts.email);
//			System.out.println(sts.phone);
//			System.out.println("------------");
//		}

	}
}
