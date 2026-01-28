import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student2{
	String name;
	int age;
	int marks;
	
	public Student2(String name, int age, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	public String toString() {
		return name;
		
	}
}

public class ComparatorSorting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Student2> arr = new ArrayList<>();
		arr.add(new Student2("Ankit",23,99));
		arr.add(new Student2("Deepak",24,98));
		arr.add(new Student2("Rohit",21,100));
		arr.add(new Student2("Lokesh",26,97));
		arr.add(new Student2("Vibha",20,94));
		
		
		System.out.println(arr);
		
		Comparator<Student2> comp = new Comparator<Student2>() {
			@Override
			public int compare(Student2 o1 , Student2 o2) {
				return o1.marks - o2.marks;
			}
		};
		
		Collections.sort(arr,comp);
		
		System.out.println(arr);

	}

}
