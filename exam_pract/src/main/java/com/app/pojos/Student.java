package com.app.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="stud_table")
public class Student extends BaseEntity {
	
	@Column(name="first_name",nullable = true,length = 30)
	private String firstName;
	@Column(name="last_name",length = 30)
	private String lastname;
	@Column(length = 30,unique = true,nullable = true)
	private String email;
	@Column(length = 50)
	private String address;
	@Column(length = 30,nullable = true)
	private String password;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="course_id")
	private Course myCourse;
	
	public Student() {
		super();
	}

	public Course getMyCourse() {
		return myCourse;
	}

	public void setMyCourse(Course myCourse) {
		this.myCourse = myCourse;
	}

	public Student(String firstName, String lastname, String email, String address, String password) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.email = email;
		this.address = address;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student "+getId()+" [firstName=" + firstName + ", lastname=" + lastname + ", email=" + email + ", address="
				+ address + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	//add hepler method for adding courseid
	public void addNewCourse(Course c) {
		this.setMyCourse(c);
	}
	
//	public void removeStudent(Long id) {
//		this.
//	}
	
	
	
	
	

}
