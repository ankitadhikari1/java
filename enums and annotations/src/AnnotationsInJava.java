

class Animal{
	public void eat() {
		System.out.println("animal is eating");
	}
}

class Tiger extends Animal{
	
	@Override
	public void eat() {
		System.out.println("tiger is eating");
	}
}




public class AnnotationsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Animal obj = new Tiger();
		obj.eat();

	}

}
