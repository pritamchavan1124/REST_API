package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="course_tbl")
public class Course extends BaseEntity{
	
	@Column(name="course_Name",unique = true)
	private String courseName;
	private int capacity;
	private double fees;
	
	public Course(String courseName, int capacity, double fees) {
		super();
		this.courseName = courseName;
		this.capacity = capacity;
		this.fees = fees;
	}

	public Course() {
		super();
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course "+getId()+"[courseName=" + courseName + ", capacity=" + capacity + ", fees=" + fees + "]";
	}
	
	
	
	

}
