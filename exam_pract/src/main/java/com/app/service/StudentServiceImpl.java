package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.customExc.StudentExc;
import com.app.pojos.Course;
import com.app.pojos.Student;
import com.app.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentServiceInterface {
	@Autowired
	private StudentRepository studRepo;

	@Override
	public List<Student> getAllStudntData() {
		
		return studRepo.findAll();
	}

	@Override
	public void AddNewStudentList(Student stud, Course course) {
		stud.addNewCourse(course);
		
		 studRepo.save(stud);
	}

	@Override
	public void removeStudentInfo(Long studId) {
		studRepo.deleteById(studId);
		
	}

	@Override
	public void updateStudentInfomation(Student studId) {
		if(studRepo.existsById(studId.getId())) {
			studRepo.save(studId);
		}
		
	}

	@Override
	public Student studentLogin(String email, String pass) {
		
		return studRepo.findByEmailAndPassword(email, pass).orElseThrow(()->new StudentExc("invalid id"));
	}

}
