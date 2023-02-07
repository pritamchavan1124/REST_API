package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Course;
import com.app.pojos.Student;
import com.app.service.StudentServiceImpl;
import com.app.service.StudentServiceInterface;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentServiceInterface studImpl;
	@GetMapping
	public List<Student> getDatailsOfStudent(){
		
		return studImpl.getAllStudntData();
	}
	@PostMapping
	public void addNewStudent(Student stud,Course course) {
		 studImpl.AddNewStudentList(stud,course);
	}
	@DeleteMapping("/{studId}")
	public void deleteStudentInfo(Long studId) {
		
		studImpl.removeStudentInfo(studId);
	}
	@PutMapping
	public void updateStudentInfo(@RequestBody Student studId) {
		studImpl.updateStudentInfomation(studId);
	}
	@PostMapping("/signin")
	public Student studentLogin(@PathVariable String email, @PathVariable String pass) {
		return studImpl.studentLogin(email,pass);
	}

}
