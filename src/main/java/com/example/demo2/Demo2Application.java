package com.example.demo2;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.student.Student;

import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

	@GetMapping
	public List<Student> hello() {
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
