import java.util.ArrayList;
import java.util.Iterator;

class Student1{
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student1(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	
	
	
}

class College{
	private String name;
	private ArrayList<Student1> students;
	
	
	public College(String name) {
		super();
		this.name = name;
		this.students = new ArrayList<>();
	}
	
	public void addStudents(Student1 student) {
		students.add(student);
	}	
	
	public void getStudents() {
		Iterator<Student1> itr = students.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	
}



public class AssociationOnetoMany {

	public static void main(String[] args) {
		Student1 obj1 = new Student1("Ankit",1);
		Student1 obj2 = new Student1("Lokesh",2);
		Student1 obj3 = new Student1("Rohit",3);
		Student1 obj4 = new Student1("Deepak",4);
		
		College clg = new College("Graphic era");
		clg.addStudents(obj1);
		clg.addStudents(obj2);
		clg.addStudents(obj3);
		clg.addStudents(obj4);
		
		clg.getStudents();

	}

}
