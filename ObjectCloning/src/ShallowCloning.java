
class Passport {
	String passportNumber;
	
	public Passport(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	
	public String getNumber() {
		return passportNumber;
	}
	
}

class Student implements Cloneable{
	String name;
	Passport passport;
	
	public Student(String name , Passport passport){
		this.name = name;
		this.passport = passport;
	}
	
	public void getDetails() {
		System.out.println("Name :"+ name);
		System.out.println("Name :"+ passport.getNumber());
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}



public class ShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		
		Passport pass = new Passport("1234");
		Student st1 = new Student("Ankit",pass);
		st1.getDetails();
		
		Student st2 = (Student) st1.clone();
		st2.passport.passportNumber = "5678";
		st1.getDetails();
		st2.getDetails();
		
		
		// this is example of shallow copy
		
		
		

	}

}
