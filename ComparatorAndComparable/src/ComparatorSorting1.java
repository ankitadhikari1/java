import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student1{
	String name;
	int age;
	int marks;
	
	public Student1(String name, int age, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	public String toString() {
		return name;
		
	}
}


class CompareMarks implements Comparator<Student1>{
	@Override
	public int compare(Student1 o1 , Student1 o2) {
		return o1.marks - o2.marks;
	}

}


public class ComparatorSorting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Student1> arr = new ArrayList<>();
		arr.add(new Student1("Ankit",23,99));
		arr.add(new Student1("Deepak",24,98));
		arr.add(new Student1("Rohit",21,100));
		arr.add(new Student1("Lokesh",26,97));
		arr.add(new Student1("Vibha",20,94));
		
		
		System.out.println(arr);
		
		CompareMarks comp = new CompareMarks();
		
		Collections.sort(arr,comp);
		
		System.out.println(arr);

	}

}
