package com.example.demo2.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
	public List<Student> getStudents() {
		return List.of(
				new Student(
						1L,
						"chase",
						"chase@email.com",
						LocalDate.of(2000, Month.JANUARY, 1),
						21
				));
	}

}
