package javaBasics;


class Student{
	
	static int a ;
	
	
	
	static {
		System.out.println("this is static class");
	}
	
	
	static void disp() {
		System.out.println(a);
	}
}




public class StaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.disp();

	}

}
