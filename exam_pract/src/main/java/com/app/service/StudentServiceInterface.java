package com.app.service;

import java.util.List;

import com.app.pojos.Course;
import com.app.pojos.Student;

public interface StudentServiceInterface {

	List<Student> getAllStudntData();

	void AddNewStudentList(Student stud, Course course);
	void removeStudentInfo(Long studId);

	void updateStudentInfomation(Student studId);

	Student studentLogin(String email, String pass);

}
