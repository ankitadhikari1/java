package javaBasics;


interface A{
	public void func();
}


public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj = new A(){
			@Override
			public void func() {
				System.out.println("hello");
			}
		};
		
		obj.func();

	}

}
