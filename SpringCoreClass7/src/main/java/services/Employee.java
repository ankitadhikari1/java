package services;

public class Employee {

	private Integer empid;
	private String name;
	private Double salary;
	private String city;
	
	private Department depart;
	
	public Employee() {
		super();
		System.out.println("employee bean created");
	}
	
	
	
//	public Employee(Integer empid, String name, Double salary, String city, Department depart) {
//		super();
//		this.empid = empid;
//		this.name = name;
//		this.salary = salary;
//		this.city = city;
//		this.depart = depart;
//	}

	public Integer getEmpid() {
		return empid;
	}



	public void setEmpid(Integer empid) {
		this.empid = empid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Double getSalary() {
		return salary;
	}



	public void setSalary(Double salary) {
		this.salary = salary;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public Department getDepart() {
		return depart;
	}



	public void setDepart(Department depart) {
		this.depart = depart;
	}



	public String employeeTask() {
		return "Every employee acts productive but in reality they are less productive";
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", city=" + city + ", depart="
				+ depart + "]";
	}

	
	
	
}
