package com.app.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.pojos.Student;

@Rollback(false)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class TestStudent {
	@Autowired
	private StudentRepository studRepo;
	
	@Test
	void test()
	{
		assertNotNull(studRepo);
	}
	// firstName,  lastname,  email,  address,  password
	@Test
	void AddStudent() {
		List<Student> list=List.of(new Student("pritam", "chavan", "pritam@gmail.com", "pune", "p123"),
				new Student("hemant", "pangle", "hemant@gmail.com", "jalgav", "h123"),
				new Student("nikhil", "dhage", "niks@yahoo.com", "n123", "akurdi"));
		studRepo.saveAll(list);
	}

}
