
class Passport2 implements Cloneable {
	String passportNumber;
	
	public Passport2(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	
	public String getNumber() {
		return passportNumber;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

class Student2 implements Cloneable{
	String name;
	Passport2 passport;
	
	public Student2(String name , Passport2 passport){
		this.name = name;
		this.passport = passport;
	}
	
	public void getDetails() {
		System.out.println("Name :"+ name);
		System.out.println("Name :"+ passport.getNumber());
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Student2 cloned = (Student2) super.clone();
		cloned.passport = (Passport2) passport.clone();
		return cloned;
	}
}



public class DeepCloningJava {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		

		Passport2 pass = new Passport2("1234");
		Student2 st1 = new Student2("Ankit",pass);
		st1.getDetails();
		
		Student2 st2 = (Student2) st1.clone();
		st2.passport.passportNumber = "5678";
		st1.getDetails();
		st2.getDetails();
		

	}

}
