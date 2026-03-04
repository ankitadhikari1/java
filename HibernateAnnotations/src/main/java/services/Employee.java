package services;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "EmployeeInfo")
public class Employee {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY )
	
	//used for our own sequence number
	@GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "my_seq")
	@SequenceGenerator(name="my_seq",sequenceName="My_OwnSequence",initialValue = 100, allocationSize = 1 )
	private Integer id;
	
	private String name;
	
	private String city;
	
	public Employee() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
	
	
}
