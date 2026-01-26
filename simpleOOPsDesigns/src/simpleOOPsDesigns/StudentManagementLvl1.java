package simpleOOPsDesigns;

import java.util.ArrayList;

interface Person{
	public void getDetails();
	public void setDetails(int id , String name);
}


class Student implements Person{
	private int id;
	private String name;
	
	
	public Student(int id , String name) {
		
		this.id = id;
		this.name = name;
	}
	
	@Override
	public void getDetails() {
		System.out.println(toString());
		System.out.println("id :" + id);
		System.out.println("name :" + name);
	}
	
	@Override
	public void setDetails(int id , String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student";
	}
	
	
}


class Teacher implements Person{
	private ArrayList<Student> students;
	private int id;
	private String name;
	
	
	public Teacher(int id , String name) {
		this.id = id;
		this.name = name;
		students = new ArrayList<>();
	}
	public Teacher() {
		this.id = -1;
		this.name = "unassigned";
		students = new ArrayList<>();
	}
	
	@Override
	public void getDetails() {
		System.out.println(toString());
		System.out.println("id :" + id);
		System.out.println("name :" + name);
		displayStudents();
	}
	
	@Override
	public void setDetails(int id , String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Teacher";
	}
	
	public void assignStudents(ArrayList<Student> arr) {
		for(Student st : arr) {	
			students.add(st);
		}
	}
	
	public void displayStudents() {
		for(Student st : students) {
			st.getDetails();
		}
	}
}



public class StudentManagementLvl1 {

	public static void main(String[] args) {
		Teacher tch = new Teacher(1,"Sanjay");
		ArrayList<Student> students = new ArrayList<>();
		Student st1 = new Student(1,"Ankit");
		Student st2 = new Student(2,"Deepak");
		Student st3 = new Student(3,"Vibha");
		Student st4 = new Student(4,"Lokesh");
		Student st5 = new Student(5,"Rohit");
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		students.add(st5);
		
		
		tch.assignStudents(students);
		tch.getDetails();

	}

}
