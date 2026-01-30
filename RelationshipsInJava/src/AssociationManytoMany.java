import java.util.ArrayList;
import java.util.Iterator;

class Student3{
	private String name;
	private ArrayList<Course> cources;
	
	public Student3(String name) {
		this.name = name;
		cources = new ArrayList<>();
	}
	
	public void addCourse(Course crs) {
		cources.add(crs);
	}
	
	public void getStudentName() {
		System.out.println(name);
	}
	
	public void getCourse() {
		for(int i=0;i<cources.size();i++) {
			 cources.get(i).getCourseName();
		}
	}
	

	
}

class Course{
	
	private String name;
	private ArrayList<Student3> students;
	
	public Course(String name) {
		this.name = name;
		students = new ArrayList<>();
	}
	
	public void addStudent(Student3 student) {
		students.add(student);
	}
	
	public void getCourseName() {
		System.out.println(name);
	}
	
	public void getStudents() {
		for(int i=0;i<students.size();i++) {
			students.get(i).getStudentName();
		}
	}
	
}



public class AssociationManytoMany {

	public static void main(String[] args) {
		
		Student3 st1 = new Student3("Ankit");
		Student3 st2 = new Student3("Lokesh");
		
		Course crs1 = new Course("Math");
		Course crs2 = new Course("Science");
		
		st1.addCourse(crs1);
		st1.addCourse(crs2);
		
		st2.addCourse(crs1);
		st2.addCourse(crs2);
		
		crs1.addStudent(st1);
		crs1.addStudent(st2);
		
		crs2.addStudent(st1);
		crs2.addStudent(st2);
		
		st1.getCourse();
		st2.getCourse();
		
		crs1.getStudents();
		crs2.getStudents();
		
		
		
		
		
		
		
		

	}

}
