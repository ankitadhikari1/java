package com.project.model;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Entity
@Table(name = "StudentTable" )


//these two annotations are needed
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)



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
