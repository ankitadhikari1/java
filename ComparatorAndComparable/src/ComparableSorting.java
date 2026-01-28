import java.util.ArrayList;
import java.util.Collections;

class Student4 implements Comparable<Student4>{
	String name;
	int marks;

	public Student4(String name ,int marks) {
		super();
		this.marks = marks;
		this.name = name;
	}
	
	
	public int compareTo(Student4 obj) {
		return this.marks - obj.marks;
	}
	
	public String toString() {
		return name;
	}
	
	
}



public class ComparableSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student4> arr = new ArrayList<>();
		arr.add(new Student4("Ankit",99));
		arr.add(new Student4("Deepak",98));
		arr.add(new Student4("Rohit",100));
		arr.add(new Student4("Lokesh",97));
		arr.add(new Student4("Vibha",94));
		
		
		System.out.println(arr);
		
		
		
		Collections.sort(arr);
		
		System.out.println(arr);

	}

}
