package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Student;

@Component
public class StudentService {

	@Autowired
	private List<Student> studentList;
	
	public List<Student> getStudents()
	{
		return studentList;
	}
	
}
