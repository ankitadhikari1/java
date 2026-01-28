import java.util.ArrayList;
import java.util.Collections;

class Student{
	String name;
	int age;
	int marks;
	
	public Student(String name, int age, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
}


public class ComplexSortingClass {

	public static void main(String[] args) {
		
		ArrayList<Student> arr = new ArrayList<>();
		arr.add(new Student("Ankit",23,99));
		arr.add(new Student("Deepak",24,98));
		arr.add(new Student("Rohit",21,100));
		arr.add(new Student("Lokesh",26,97));
		arr.add(new Student("Vibha",20,94));
		
		
		// Collections.sort(arr);
		

	}

}
