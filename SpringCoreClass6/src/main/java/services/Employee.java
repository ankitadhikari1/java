package services;

public class Employee {

	private Integer empid;
	private String name;
	private Double salary;
	private String city;
	
	public Employee(Integer empid, String name, Double salary, String city) {
		super();
		System.out.println("employee bean created");
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.city = city;
	}
	
	public String employeeTask() {
		return "Every employee acts productive but in reality they are less productive";
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}
	
	
	
}
