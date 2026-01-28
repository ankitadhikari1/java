import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;

class Student3{
	String name;
	int age;
	int marks;
	
	public Student3(String name, int age, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	public String toString() {
		return name;
		
	}
}


public class ComparatorSorting3 {

	public static void main(String[] args) {
		ArrayList<Student3> arr = new ArrayList<>();
		arr.add(new Student3("Ankit",23,99));
		arr.add(new Student3("Deepak",24,98));
		arr.add(new Student3("Rohit",21,100));
		arr.add(new Student3("Lokesh",26,97));
		arr.add(new Student3("Vibha",20,94));
		
		
		System.out.println(arr);
		
		
		
		Collections.sort(arr,(Student3 o1 , Student3 o2)-> {
			{	
				return o1.marks - o2.marks;
			}
		});
		
		System.out.println(arr);


	}

}
