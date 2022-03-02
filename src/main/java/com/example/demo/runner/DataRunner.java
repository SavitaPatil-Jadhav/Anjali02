package com.example.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Student;

@Component
public class DataRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		System.out.println("In side Runner");
		
		//CI
		//SI
		
		Student s = new Student();
		System.out.println("Default Constructor Student : "+s);
		
		Student s1 = new Student(10, "Anjali", 1.0);
		System.out.println("Student in Param : "+s1);
		
		s.setSid(10);
		s.setSname("Sanket");
		s.setSfee(12.3);
		
		System.out.println("After SI : "+s);
		
		Student s2 = new Student(10, "Anjali");
		
		System.out.println("Required Args : "+s2);
	}

}
