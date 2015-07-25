public class Statup {
	public static void main(String[] args) {
		double a = Calculator.add(34, 90);
		double b = Calculator.substract(899, 93);
		System.out.println(a);
		System.out.println(b);
		
		//Person person1 = new Person();
		Person.firstName = "rama";
		Person.midName = "nanada";
		Person.lastName = "sarkar";
		
		String fullName = Person.getFullName();
		System.out.println(fullName);
		
		//Person person2 = new Person();
		Person.firstName = "rasama";
		Person.midName = "ashu";
		Person.lastName = "roy";
		
		String full = Person.getFullName();
		System.out.println(full);
	}
}
