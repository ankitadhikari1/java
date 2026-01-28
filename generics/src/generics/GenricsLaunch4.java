package generics;

import java.util.ArrayList;

class Human{
	public int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

class Student extends Human{
	
}


class Employee{
	
}


public class GenricsLaunch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1
		Object obj = new Object();
		String s = new String();
		
		obj = s;
		// s = obj; (CE)
		
		
		//2
		Human h = new Human();
		Student st = new Student();
		
		h = st;
		// st = h; (CE)
		
		
		//3
		ArrayList<Human> hlist1 = new ArrayList<>();
		ArrayList<Student> slist1 = new ArrayList<>();
		
		// hlist1 = slist1; (CE)
		// slist1 = hlist1; (CE)
		
		//4
		ArrayList<?> hlist2 = new ArrayList<>();
		// ? - wild card (for unknown type)
		ArrayList<Student> slist2 = new ArrayList<>();
		
		hlist2 = slist2;
		// slist2 = hlist2; (CE)
		
		
		
		//5
		// this is also known as upper bound
		ArrayList<? extends Human> hlist3 = new ArrayList<>();
		// ? - wild card (for unknown type)
		ArrayList<Student> slist3 = new ArrayList<>();
		ArrayList<Employee> elist3 = new ArrayList<>();
		
		hlist3 = slist3;
		// hlist3 = elist3; (CE)
		
		
		//5
		// this is also known as lower bound
		ArrayList<? super Human> hlist4 = new ArrayList<>();
		// ? - wild card (for unknown type)
		ArrayList<Student> slist4 = new ArrayList<>();
		ArrayList<Employee> elist4 = new ArrayList<>();
		ArrayList<Object> obj4 = new ArrayList<>();
				
		// hlist4 = slist4; (CE)
		// hlist4 = elist4; (CE)
		   hlist4 = obj4;
		   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
