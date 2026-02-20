package com.ankit.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "StudentTable" )
public class Student {
 
	
	@Id 
	@Column(name = "SID")
	private Integer sId;
	
	@Column(name = "SNAME")
	private String sName;
	
	@Column(name = "SCITY")
	private String city;
	
	
	public Student() {
		System.out.println("zero parameterized constructor for hibernate");
	}

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", city=" + city + "]";
	}
	
	
	
}
