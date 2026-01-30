

class Passport{
	private String passportNumber;
	
	public Passport(String number) {
		this.passportNumber = number;
	}
	
	public String getDetails() {
		return passportNumber;
	}
	
}

class Student{
	private String name;
	private Passport passport;
	
	public Student(String name , Passport passport) {
		this.name = name;
		this.passport = passport;
	}
	
	public void getDetails() {
		System.out.println("Name :"+name);
		System.out.println("passport number :" + passport.getDetails());
	}
	
	
}



public class AssociationOnetoOne {

	public static void main(String[] args) {
		Passport passport = new Passport("12345678");
		Student st = new Student("Ankit",passport);
		st.getDetails();

	}

}
